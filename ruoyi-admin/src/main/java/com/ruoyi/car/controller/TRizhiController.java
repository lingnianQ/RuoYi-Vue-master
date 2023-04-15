package com.ruoyi.car.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.car.domain.TRizhi;
import com.ruoyi.car.service.ITRizhiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 日志Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/rizhi")
public class TRizhiController extends BaseController
{
    @Autowired
    private ITRizhiService tRizhiService;

    /**
     * 查询日志列表
     */
    @PreAuthorize("@ss.hasPermi('car:rizhi:list')")
    @GetMapping("/list")
    public TableDataInfo list(TRizhi tRizhi)
    {
        startPage();
        List<TRizhi> list = tRizhiService.selectTRizhiList(tRizhi);
        return getDataTable(list);
    }

    /**
     * 导出日志列表
     */
    @PreAuthorize("@ss.hasPermi('car:rizhi:export')")
    @Log(title = "日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TRizhi tRizhi)
    {
        List<TRizhi> list = tRizhiService.selectTRizhiList(tRizhi);
        ExcelUtil<TRizhi> util = new ExcelUtil<TRizhi>(TRizhi.class);
        util.exportExcel(response, list, "日志数据");
    }

    /**
     * 获取日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:rizhi:query')")
    @GetMapping(value = "/{rizhiid}")
    public AjaxResult getInfo(@PathVariable("rizhiid") Long rizhiid)
    {
        return AjaxResult.success(tRizhiService.selectTRizhiByRizhiid(rizhiid));
    }

    /**
     * 新增日志
     */
    @PreAuthorize("@ss.hasPermi('car:rizhi:add')")
    @Log(title = "日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TRizhi tRizhi)
    {
        return toAjax(tRizhiService.insertTRizhi(tRizhi));
    }

    /**
     * 修改日志
     */
    @PreAuthorize("@ss.hasPermi('car:rizhi:edit')")
    @Log(title = "日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TRizhi tRizhi)
    {
        return toAjax(tRizhiService.updateTRizhi(tRizhi));
    }

    /**
     * 删除日志
     */
    @PreAuthorize("@ss.hasPermi('car:rizhi:remove')")
    @Log(title = "日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rizhiids}")
    public AjaxResult remove(@PathVariable Long[] rizhiids)
    {
        return toAjax(tRizhiService.deleteTRizhiByRizhiids(rizhiids));
    }
}
