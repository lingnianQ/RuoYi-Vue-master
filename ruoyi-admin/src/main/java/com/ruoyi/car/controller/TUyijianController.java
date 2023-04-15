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
import com.ruoyi.car.domain.TUyijian;
import com.ruoyi.car.service.ITUyijianService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评价Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/uyijian")
public class TUyijianController extends BaseController
{
    @Autowired
    private ITUyijianService tUyijianService;

    /**
     * 查询评价列表
     */
    @PreAuthorize("@ss.hasPermi('car:uyijian:list')")
    @GetMapping("/list")
    public TableDataInfo list(TUyijian tUyijian)
    {
        startPage();
        List<TUyijian> list = tUyijianService.selectTUyijianList(tUyijian);
        return getDataTable(list);
    }

    /**
     * 导出评价列表
     */
    @PreAuthorize("@ss.hasPermi('car:uyijian:export')")
    @Log(title = "评价", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TUyijian tUyijian)
    {
        List<TUyijian> list = tUyijianService.selectTUyijianList(tUyijian);
        ExcelUtil<TUyijian> util = new ExcelUtil<TUyijian>(TUyijian.class);
        util.exportExcel(response, list, "评价数据");
    }

    /**
     * 获取评价详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:uyijian:query')")
    @GetMapping(value = "/{uyijianid}")
    public AjaxResult getInfo(@PathVariable("uyijianid") Long uyijianid)
    {
        return AjaxResult.success(tUyijianService.selectTUyijianByUyijianid(uyijianid));
    }

    /**
     * 新增评价
     */
    @PreAuthorize("@ss.hasPermi('car:uyijian:add')")
    @Log(title = "评价", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TUyijian tUyijian)
    {
        return toAjax(tUyijianService.insertTUyijian(tUyijian));
    }

    /**
     * 修改评价
     */
    @PreAuthorize("@ss.hasPermi('car:uyijian:edit')")
    @Log(title = "评价", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TUyijian tUyijian)
    {
        return toAjax(tUyijianService.updateTUyijian(tUyijian));
    }

    /**
     * 删除评价
     */
    @PreAuthorize("@ss.hasPermi('car:uyijian:remove')")
    @Log(title = "评价", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uyijianids}")
    public AjaxResult remove(@PathVariable Long[] uyijianids)
    {
        return toAjax(tUyijianService.deleteTUyijianByUyijianids(uyijianids));
    }
}
