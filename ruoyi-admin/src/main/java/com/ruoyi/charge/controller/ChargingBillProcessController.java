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
import com.ruoyi.charge.domain.ChargingBillProcess;
import com.ruoyi.charge.service.IChargingBillProcessService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 进行订单Controller
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@RestController
@RequestMapping("/charge/process")
public class ChargingBillProcessController extends BaseController
{
    @Autowired
    private IChargingBillProcessService chargingBillProcessService;

    /**
     * 查询进行订单列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:process:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingBillProcess chargingBillProcess)
    {
        startPage();
        List<ChargingBillProcess> list = chargingBillProcessService.selectChargingBillProcessList(chargingBillProcess);
        return getDataTable(list);
    }

    /**
     * 导出进行订单列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:process:export')")
    @Log(title = "进行订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingBillProcess chargingBillProcess)
    {
        List<ChargingBillProcess> list = chargingBillProcessService.selectChargingBillProcessList(chargingBillProcess);
        ExcelUtil<ChargingBillProcess> util = new ExcelUtil<ChargingBillProcess>(ChargingBillProcess.class);
        util.exportExcel(response, list, "进行订单数据");
    }

    /**
     * 获取进行订单详细信息
     */
//    @PreAuthorize("@ss.hasPermi('charge:process:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(chargingBillProcessService.selectChargingBillProcessById(id));
    }

    /**
     * 新增进行订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:process:add')")
    @Log(title = "进行订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingBillProcess chargingBillProcess)
    {
        return toAjax(chargingBillProcessService.insertChargingBillProcess(chargingBillProcess));
    }

    /**
     * 修改进行订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:process:edit')")
    @Log(title = "进行订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingBillProcess chargingBillProcess)
    {
        return toAjax(chargingBillProcessService.updateChargingBillProcess(chargingBillProcess));
    }

    /**
     * 删除进行订单
     */
//    @PreAuthorize("@ss.hasPermi('charge:process:remove')")
    @Log(title = "进行订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(chargingBillProcessService.deleteChargingBillProcessByIds(ids));
    }
}
