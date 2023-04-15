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
import com.ruoyi.car.domain.TSpgys;
import com.ruoyi.car.service.ITSpgysService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工信息Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/spgys")
public class TSpgysController extends BaseController
{
    @Autowired
    private ITSpgysService tSpgysService;

    /**
     * 查询员工信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:spgys:list')")
    @GetMapping("/list")
    public TableDataInfo list(TSpgys tSpgys)
    {
        startPage();
        List<TSpgys> list = tSpgysService.selectTSpgysList(tSpgys);
        return getDataTable(list);
    }

    /**
     * 导出员工信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:spgys:export')")
    @Log(title = "员工信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TSpgys tSpgys)
    {
        List<TSpgys> list = tSpgysService.selectTSpgysList(tSpgys);
        ExcelUtil<TSpgys> util = new ExcelUtil<TSpgys>(TSpgys.class);
        util.exportExcel(response, list, "员工信息数据");
    }

    /**
     * 获取员工信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:spgys:query')")
    @GetMapping(value = "/{spgysid}")
    public AjaxResult getInfo(@PathVariable("spgysid") Long spgysid)
    {
        return AjaxResult.success(tSpgysService.selectTSpgysBySpgysid(spgysid));
    }

    /**
     * 新增员工信息
     */
    @PreAuthorize("@ss.hasPermi('car:spgys:add')")
    @Log(title = "员工信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TSpgys tSpgys)
    {
        return toAjax(tSpgysService.insertTSpgys(tSpgys));
    }

    /**
     * 修改员工信息
     */
    @PreAuthorize("@ss.hasPermi('car:spgys:edit')")
    @Log(title = "员工信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TSpgys tSpgys)
    {
        return toAjax(tSpgysService.updateTSpgys(tSpgys));
    }

    /**
     * 删除员工信息
     */
    @PreAuthorize("@ss.hasPermi('car:spgys:remove')")
    @Log(title = "员工信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{spgysids}")
    public AjaxResult remove(@PathVariable Long[] spgysids)
    {
        return toAjax(tSpgysService.deleteTSpgysBySpgysids(spgysids));
    }
}
