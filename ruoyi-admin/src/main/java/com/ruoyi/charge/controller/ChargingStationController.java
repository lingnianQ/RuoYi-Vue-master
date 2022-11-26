package com.ruoyi.charge.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.charge.domain.NearbyChargingStation;
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
import com.ruoyi.charge.domain.ChargingStation;
import com.ruoyi.charge.service.IChargingStationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充电站Controller
 *
 * @author ruoyi
 * @date 2022-11-10
 */
@RestController
@RequestMapping("/charge/station")
public class ChargingStationController extends BaseController {
    @Autowired
    private IChargingStationService chargingStationService;


    /**
     * 查询附近充电站列表
     */
    // @PreAuthorize("@ss.hasPermi('charge:station:list')")
    @GetMapping("/nearbylist")
    public AjaxResult nearbylist(double longitude, double latitude, double radius) {

        List<NearbyChargingStation> list = chargingStationService.selectNearbyChargingStationList(longitude, latitude, radius);
        return AjaxResult.success(list);

    }

    /**
     * 查询充电站列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:station:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingStation chargingStation) {
        startPage();
        List<ChargingStation> list = chargingStationService.selectChargingStationList(chargingStation);
        return getDataTable(list);
    }

    /**
     * 导出充电站列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:station:export')")
    @Log(title = "充电站", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingStation chargingStation) {
        List<ChargingStation> list = chargingStationService.selectChargingStationList(chargingStation);
        ExcelUtil<ChargingStation> util = new ExcelUtil<ChargingStation>(ChargingStation.class);
        util.exportExcel(response, list, "充电站数据");
    }

    /**
     * 获取充电站详细信息
     */
//    @PreAuthorize("@ss.hasPermi('charge:station:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id) {
        return AjaxResult.success(chargingStationService.selectChargingStationById(id));
    }

    /**
     * 新增充电站
     */
//    @PreAuthorize("@ss.hasPermi('charge:station:add')")
    @Log(title = "充电站", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingStation chargingStation) {
        return toAjax(chargingStationService.insertChargingStation(chargingStation));
    }

    /**
     * 修改充电站
     */
//    @PreAuthorize("@ss.hasPermi('charge:station:edit')")
    @Log(title = "充电站", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingStation chargingStation) {
        return toAjax(chargingStationService.updateChargingStation(chargingStation));
    }

    /**
     * 删除充电站
     */
//    @PreAuthorize("@ss.hasPermi('charge:station:remove')")
    @Log(title = "充电站", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids) {
        return toAjax(chargingStationService.deleteChargingStationByIds(ids));
    }
}
