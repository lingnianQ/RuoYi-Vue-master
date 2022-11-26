package com.ruoyi.charge.controller;

import com.ruoyi.charge.domain.ChargingBillSucces;
import com.ruoyi.charge.service.IChargingBillSuccesService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 成功订单Controller
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@RestController
@RequestMapping("/charge/succes")
public class ChargingBillSuccesController extends BaseController
{
    @Autowired
    private IChargingBillSuccesService chargingBillSuccesService;

    /**
     * 查询成功订单列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:succes:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingBillSucces chargingBillSucces)
    {
        startPage();
        List<ChargingBillSucces> list = chargingBillSuccesService.selectChargingBillSuccesList(chargingBillSucces);
        return getDataTable(list);
    }

    /**
     * 导出成功订单列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:succes:export')")
    @Log(title = "成功订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingBillSucces chargingBillSucces)
    {
        List<ChargingBillSucces> list = chargingBillSuccesService.selectChargingBillSuccesList(chargingBillSucces);
        ExcelUtil<ChargingBillSucces> util = new ExcelUtil<ChargingBillSucces>(ChargingBillSucces.class);
        util.exportExcel(response, list, "成功订单数据");
    }

    /**
     * 获取成功订单详细信息
     */
//    @PreAuthorize("@ss.hasPermi('charge:succes:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(chargingBillSuccesService.selectChargingBillSuccesById(id));
    }

    /**
     * 新增成功订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:succes:add')")
    @Log(title = "成功订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingBillSucces chargingBillSucces)
    {
        return toAjax(chargingBillSuccesService.insertChargingBillSucces(chargingBillSucces));
    }

    /**
     * 修改成功订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:succes:edit')")
    @Log(title = "成功订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingBillSucces chargingBillSucces)
    {
        return toAjax(chargingBillSuccesService.updateChargingBillSucces(chargingBillSucces));
    }

    /**
     * 删除成功订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:succes:remove')")
    @Log(title = "成功订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(chargingBillSuccesService.deleteChargingBillSuccesByIds(ids));
    }
}
