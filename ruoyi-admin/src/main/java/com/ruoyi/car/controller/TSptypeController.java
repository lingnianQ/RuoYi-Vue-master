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
import com.ruoyi.car.domain.TSptype;
import com.ruoyi.car.service.ITSptypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 区域信息Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/sptype")
public class TSptypeController extends BaseController
{
    @Autowired
    private ITSptypeService tSptypeService;

    /**
     * 查询区域信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:sptype:list')")
    @GetMapping("/list")
    public TableDataInfo list(TSptype tSptype)
    {
        startPage();
        List<TSptype> list = tSptypeService.selectTSptypeList(tSptype);
        return getDataTable(list);
    }

    /**
     * 导出区域信息列表
     */
    @PreAuthorize("@ss.hasPermi('car:sptype:export')")
    @Log(title = "区域信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TSptype tSptype)
    {
        List<TSptype> list = tSptypeService.selectTSptypeList(tSptype);
        ExcelUtil<TSptype> util = new ExcelUtil<TSptype>(TSptype.class);
        util.exportExcel(response, list, "区域信息数据");
    }

    /**
     * 获取区域信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:sptype:query')")
    @GetMapping(value = "/{sptypeid}")
    public AjaxResult getInfo(@PathVariable("sptypeid") Long sptypeid)
    {
        return AjaxResult.success(tSptypeService.selectTSptypeBySptypeid(sptypeid));
    }

    /**
     * 新增区域信息
     */
    @PreAuthorize("@ss.hasPermi('car:sptype:add')")
    @Log(title = "区域信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TSptype tSptype)
    {
        return toAjax(tSptypeService.insertTSptype(tSptype));
    }

    /**
     * 修改区域信息
     */
    @PreAuthorize("@ss.hasPermi('car:sptype:edit')")
    @Log(title = "区域信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TSptype tSptype)
    {
        return toAjax(tSptypeService.updateTSptype(tSptype));
    }

    /**
     * 删除区域信息
     */
    @PreAuthorize("@ss.hasPermi('car:sptype:remove')")
    @Log(title = "区域信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sptypeids}")
    public AjaxResult remove(@PathVariable Long[] sptypeids)
    {
        return toAjax(tSptypeService.deleteTSptypeBySptypeids(sptypeids));
    }
}
