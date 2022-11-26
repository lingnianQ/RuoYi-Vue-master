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
import com.ruoyi.charge.domain.ChargingPileInfo;
import com.ruoyi.charge.service.IChargingPileInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充电桩Controller
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@RestController
@RequestMapping("/charge/pile")
public class ChargingPileInfoController extends BaseController
{
    @Autowired
    private IChargingPileInfoService chargingPileInfoService;

    /**
     * 查询充电桩列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:pile:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingPileInfo chargingPileInfo)
    {
        startPage();
        List<ChargingPileInfo> list = chargingPileInfoService.selectChargingPileInfoList(chargingPileInfo);
        return getDataTable(list);
    }

    /**
     * 导出充电桩列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:pile:export')")
    @Log(title = "充电桩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingPileInfo chargingPileInfo)
    {
        List<ChargingPileInfo> list = chargingPileInfoService.selectChargingPileInfoList(chargingPileInfo);
        ExcelUtil<ChargingPileInfo> util = new ExcelUtil<ChargingPileInfo>(ChargingPileInfo.class);
        util.exportExcel(response, list, "充电桩数据");
    }

    /**
     * 获取充电桩详细信息
     */
//    @PreAuthorize("@ss.hasPermi('charge:pile:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(chargingPileInfoService.selectChargingPileInfoById(id));
    }

    /**
     * 新增充电桩
     */
//    @PreAuthorize("@ss.hasPermi('charge:pile:add')")
    @Log(title = "充电桩", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingPileInfo chargingPileInfo)
    {
        return toAjax(chargingPileInfoService.insertChargingPileInfo(chargingPileInfo));
    }

    /**
     * 修改充电桩
     */
//    @PreAuthorize("@ss.hasPermi('charge:pile:edit')")
    @Log(title = "充电桩", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingPileInfo chargingPileInfo)
    {
        return toAjax(chargingPileInfoService.updateChargingPileInfo(chargingPileInfo));
    }

    /**
     * 删除充电桩
     */
//    @PreAuthorize("@ss.hasPermi('charge:pile:remove')")
    @Log(title = "充电桩", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(chargingPileInfoService.deleteChargingPileInfoByIds(ids));
    }
}
