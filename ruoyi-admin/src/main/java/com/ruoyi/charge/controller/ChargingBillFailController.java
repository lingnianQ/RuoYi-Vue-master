package com.ruoyi.charge.controller;

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
import com.ruoyi.charge.domain.ChargingBillFail;
import com.ruoyi.charge.service.IChargingBillFailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 失败订单Controller
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@RestController
@RequestMapping("/charge/fail")
public class ChargingBillFailController extends BaseController
{
    @Autowired
    private IChargingBillFailService chargingBillFailService;

    /**
     * 查询失败订单列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:fail:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingBillFail chargingBillFail)
    {
        startPage();
        List<ChargingBillFail> list = chargingBillFailService.selectChargingBillFailList(chargingBillFail);
        return getDataTable(list);
    }

    /**
     * 导出失败订单列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:fail:export')")
    @Log(title = "失败订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingBillFail chargingBillFail)
    {
        List<ChargingBillFail> list = chargingBillFailService.selectChargingBillFailList(chargingBillFail);
        ExcelUtil<ChargingBillFail> util = new ExcelUtil<ChargingBillFail>(ChargingBillFail.class);
        util.exportExcel(response, list, "失败订单数据");
    }

    /**
     * 获取失败订单详细信息
     */
//    @PreAuthorize("@ss.hasPermi('charge:fail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(chargingBillFailService.selectChargingBillFailById(id));
    }

    /**
     * 新增失败订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:fail:add')")
    @Log(title = "失败订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingBillFail chargingBillFail)
    {
        return toAjax(chargingBillFailService.insertChargingBillFail(chargingBillFail));
    }

    /**
     * 修改失败订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:fail:edit')")
    @Log(title = "失败订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingBillFail chargingBillFail)
    {
        return toAjax(chargingBillFailService.updateChargingBillFail(chargingBillFail));
    }

    /**
     * 删除失败订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:fail:remove')")
    @Log(title = "失败订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(chargingBillFailService.deleteChargingBillFailByIds(ids));
    }
}
