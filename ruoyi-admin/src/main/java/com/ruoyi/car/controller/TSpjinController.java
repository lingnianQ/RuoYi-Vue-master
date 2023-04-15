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
import com.ruoyi.car.domain.TSpjin;
import com.ruoyi.car.service.ITSpjinService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 地址信息Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/spjin")
public class TSpjinController extends BaseController
{
    @Autowired
    private ITSpjinService tSpjinService;

    /**
     * 查询地址信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:spjin:list')")
    @GetMapping("/list")
    public TableDataInfo list(TSpjin tSpjin)
    {
        startPage();
        List<TSpjin> list = tSpjinService.selectTSpjinList(tSpjin);
        return getDataTable(list);
    }

    /**
     * 导出地址信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:spjin:export')")
    @Log(title = "地址信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TSpjin tSpjin)
    {
        List<TSpjin> list = tSpjinService.selectTSpjinList(tSpjin);
        ExcelUtil<TSpjin> util = new ExcelUtil<TSpjin>(TSpjin.class);
        util.exportExcel(response, list, "地址信息数据");
    }

    /**
     * 获取地址信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:spjin:query')")
    @GetMapping(value = "/{spjinid}")
    public AjaxResult getInfo(@PathVariable("spjinid") Long spjinid)
    {
        return AjaxResult.success(tSpjinService.selectTSpjinBySpjinid(spjinid));
    }

    /**
     * 新增地址信息
     */
    @PreAuthorize("@ss.hasPermi('car:spjin:add')")
    @Log(title = "地址信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TSpjin tSpjin)
    {
        return toAjax(tSpjinService.insertTSpjin(tSpjin));
    }

    /**
     * 修改地址信息
     */
    @PreAuthorize("@ss.hasPermi('car:spjin:edit')")
    @Log(title = "地址信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TSpjin tSpjin)
    {
        return toAjax(tSpjinService.updateTSpjin(tSpjin));
    }

    /**
     * 删除地址信息
     */
    @PreAuthorize("@ss.hasPermi('car:spjin:remove')")
    @Log(title = "地址信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{spjinids}")
    public AjaxResult remove(@PathVariable Long[] spjinids)
    {
        return toAjax(tSpjinService.deleteTSpjinBySpjinids(spjinids));
    }
}
