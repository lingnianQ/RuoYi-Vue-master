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
import com.ruoyi.car.domain.TAdmin;
import com.ruoyi.car.service.ITAdminService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 管理员Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/admin")
public class TAdminController extends BaseController
{
    @Autowired
    private ITAdminService tAdminService;

    /**
     * 查询管理员列表
     */
    @PreAuthorize("@ss.hasPermi('car:admin:list')")
    @GetMapping("/list")
    public TableDataInfo list(TAdmin tAdmin)
    {
        startPage();
        List<TAdmin> list = tAdminService.selectTAdminList(tAdmin);
        return getDataTable(list);
    }

    /**
     * 导出管理员列表
     */
    @PreAuthorize("@ss.hasPermi('car:admin:export')")
    @Log(title = "管理员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TAdmin tAdmin)
    {
        List<TAdmin> list = tAdminService.selectTAdminList(tAdmin);
        ExcelUtil<TAdmin> util = new ExcelUtil<TAdmin>(TAdmin.class);
        util.exportExcel(response, list, "管理员数据");
    }

    /**
     * 获取管理员详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:admin:query')")
    @GetMapping(value = "/{adminid}")
    public AjaxResult getInfo(@PathVariable("adminid") Long adminid)
    {
        return AjaxResult.success(tAdminService.selectTAdminByAdminid(adminid));
    }

    /**
     * 新增管理员
     */
    @PreAuthorize("@ss.hasPermi('car:admin:add')")
    @Log(title = "管理员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TAdmin tAdmin)
    {
        return toAjax(tAdminService.insertTAdmin(tAdmin));
    }

    /**
     * 修改管理员
     */
    @PreAuthorize("@ss.hasPermi('car:admin:edit')")
    @Log(title = "管理员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TAdmin tAdmin)
    {
        return toAjax(tAdminService.updateTAdmin(tAdmin));
    }

    /**
     * 删除管理员
     */
    @PreAuthorize("@ss.hasPermi('car:admin:remove')")
    @Log(title = "管理员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{adminids}")
    public AjaxResult remove(@PathVariable Long[] adminids)
    {
        return toAjax(tAdminService.deleteTAdminByAdminids(adminids));
    }
}
