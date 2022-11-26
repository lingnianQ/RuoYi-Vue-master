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
import com.ruoyi.charge.domain.ChargingGunInfo;
import com.ruoyi.charge.service.IChargingGunInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充电枪Controller
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@RestController
@RequestMapping("/charge/gun")
public class ChargingGunInfoController extends BaseController
{
    @Autowired
    private IChargingGunInfoService chargingGunInfoService;

    /**
     * 查询充电枪列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:gun:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingGunInfo chargingGunInfo)
    {
        startPage();
        List<ChargingGunInfo> list = chargingGunInfoService.selectChargingGunInfoList(chargingGunInfo);
        return getDataTable(list);
    }

    /**
     * 导出充电枪列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:gun:export')")
    @Log(title = "充电枪", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingGunInfo chargingGunInfo)
    {
        List<ChargingGunInfo> list = chargingGunInfoService.selectChargingGunInfoList(chargingGunInfo);
        ExcelUtil<ChargingGunInfo> util = new ExcelUtil<ChargingGunInfo>(ChargingGunInfo.class);
        util.exportExcel(response, list, "充电枪数据");
    }

    /**
     * 获取充电枪详细信息
     */
//    @PreAuthorize("@ss.hasPermi('charge:gun:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(chargingGunInfoService.selectChargingGunInfoById(id));
    }

    /**
     * 新增充电枪
     */
//    @PreAuthorize("@ss.hasPermi('charge:gun:add')")
    @Log(title = "充电枪", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingGunInfo chargingGunInfo)
    {
        return toAjax(chargingGunInfoService.insertChargingGunInfo(chargingGunInfo));
    }

    /**
     * 修改充电枪
     */
//    @PreAuthorize("@ss.hasPermi('charge:gun:edit')")
    @Log(title = "充电枪", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingGunInfo chargingGunInfo)
    {
        return toAjax(chargingGunInfoService.updateChargingGunInfo(chargingGunInfo));
    }

    /**
     * 删除充电枪
     */
//    @PreAuthorize("@ss.hasPermi('charge:gun:remove')")
    @Log(title = "充电枪", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(chargingGunInfoService.deleteChargingGunInfoByIds(ids));
    }
}
