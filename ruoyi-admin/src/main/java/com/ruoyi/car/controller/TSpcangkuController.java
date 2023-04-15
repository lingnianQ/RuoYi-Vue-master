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
import com.ruoyi.car.domain.TSpcangku;
import com.ruoyi.car.service.ITSpcangkuService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆信息Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/spcangku")
public class TSpcangkuController extends BaseController
{
    @Autowired
    private ITSpcangkuService tSpcangkuService;

    /**
     * 查询车辆信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:spcangku:list')")
    @GetMapping("/list")
    public TableDataInfo list(TSpcangku tSpcangku)
    {
        startPage();
        List<TSpcangku> list = tSpcangkuService.selectTSpcangkuList(tSpcangku);
        return getDataTable(list);
    }

    /**
     * 导出车辆信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:spcangku:export')")
    @Log(title = "车辆信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TSpcangku tSpcangku)
    {
        List<TSpcangku> list = tSpcangkuService.selectTSpcangkuList(tSpcangku);
        ExcelUtil<TSpcangku> util = new ExcelUtil<TSpcangku>(TSpcangku.class);
        util.exportExcel(response, list, "车辆信息数据");
    }

    /**
     * 获取车辆信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:spcangku:query')")
    @GetMapping(value = "/{spcangkuid}")
    public AjaxResult getInfo(@PathVariable("spcangkuid") Long spcangkuid)
    {
        return AjaxResult.success(tSpcangkuService.selectTSpcangkuBySpcangkuid(spcangkuid));
    }

    /**
     * 新增车辆信息
     */
    @PreAuthorize("@ss.hasPermi('car:spcangku:add')")
    @Log(title = "车辆信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TSpcangku tSpcangku)
    {
        return toAjax(tSpcangkuService.insertTSpcangku(tSpcangku));
    }

    /**
     * 修改车辆信息
     */
    @PreAuthorize("@ss.hasPermi('car:spcangku:edit')")
    @Log(title = "车辆信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TSpcangku tSpcangku)
    {
        return toAjax(tSpcangkuService.updateTSpcangku(tSpcangku));
    }

    /**
     * 删除车辆信息
     */
    @PreAuthorize("@ss.hasPermi('car:spcangku:remove')")
    @Log(title = "车辆信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{spcangkuids}")
    public AjaxResult remove(@PathVariable Long[] spcangkuids)
    {
        return toAjax(tSpcangkuService.deleteTSpcangkuBySpcangkuids(spcangkuids));
    }
}
