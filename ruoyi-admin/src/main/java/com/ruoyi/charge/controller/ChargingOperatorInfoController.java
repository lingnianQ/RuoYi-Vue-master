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
import com.ruoyi.charge.domain.ChargingOperatorInfo;
import com.ruoyi.charge.service.IChargingOperatorInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运营商Controller
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@RestController
@RequestMapping("/charge/operator")
public class ChargingOperatorInfoController extends BaseController
{
    @Autowired
    private IChargingOperatorInfoService chargingOperatorInfoService;

    /**
     * 查询运营商列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:operator:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingOperatorInfo chargingOperatorInfo)
    {
        startPage();
        List<ChargingOperatorInfo> list = chargingOperatorInfoService.selectChargingOperatorInfoList(chargingOperatorInfo);
        return getDataTable(list);
    }

    /**
     * 导出运营商列表
     */
//    @PreAuthorize("@ss.hasPermi('charge:operator:export')")
    @Log(title = "运营商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingOperatorInfo chargingOperatorInfo)
    {
        List<ChargingOperatorInfo> list = chargingOperatorInfoService.selectChargingOperatorInfoList(chargingOperatorInfo);
        ExcelUtil<ChargingOperatorInfo> util = new ExcelUtil<ChargingOperatorInfo>(ChargingOperatorInfo.class);
        util.exportExcel(response, list, "运营商数据");
    }

    /**
     * 获取运营商详细信息
     */
//    @PreAuthorize("@ss.hasPermi('charge:operator:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(chargingOperatorInfoService.selectChargingOperatorInfoById(id));
    }

    /**
     * 新增运营商
     */
//    @PreAuthorize("@ss.hasPermi('charge:operator:add')")
    @Log(title = "运营商", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingOperatorInfo chargingOperatorInfo)
    {
        return toAjax(chargingOperatorInfoService.insertChargingOperatorInfo(chargingOperatorInfo));
    }

    /**
     * 修改运营商
     */
//    @PreAuthorize("@ss.hasPermi('charge:operator:edit')")
    @Log(title = "运营商", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingOperatorInfo chargingOperatorInfo)
    {
        return toAjax(chargingOperatorInfoService.updateChargingOperatorInfo(chargingOperatorInfo));
    }

    /**
     * 删除运营商
     */
//    @PreAuthorize("@ss.hasPermi('charge:operator:remove')")
    @Log(title = "运营商", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(chargingOperatorInfoService.deleteChargingOperatorInfoByIds(ids));
    }
}
