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
import com.ruoyi.car.domain.TShangpin;
import com.ruoyi.car.service.ITShangpinService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品Controller
 * 
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/car/shangpin")
public class TShangpinController extends BaseController
{
    @Autowired
    private ITShangpinService tShangpinService;

    /**
     * 查询商品列表
     */
    @PreAuthorize("@ss.hasPermi('car:shangpin:list')")
    @GetMapping("/list")
    public TableDataInfo list(TShangpin tShangpin)
    {
        startPage();
        List<TShangpin> list = tShangpinService.selectTShangpinList(tShangpin);
        return getDataTable(list);
    }

    /**
     * 导出商品列表
     */
    @PreAuthorize("@ss.hasPermi('car:shangpin:export')")
    @Log(title = "商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TShangpin tShangpin)
    {
        List<TShangpin> list = tShangpinService.selectTShangpinList(tShangpin);
        ExcelUtil<TShangpin> util = new ExcelUtil<TShangpin>(TShangpin.class);
        util.exportExcel(response, list, "商品数据");
    }

    /**
     * 获取商品详细信息
     */
    @PreAuthorize("@ss.hasPermi('car:shangpin:query')")
    @GetMapping(value = "/{shangpinid}")
    public AjaxResult getInfo(@PathVariable("shangpinid") Long shangpinid)
    {
        return AjaxResult.success(tShangpinService.selectTShangpinByShangpinid(shangpinid));
    }

    /**
     * 新增商品
     */
    @PreAuthorize("@ss.hasPermi('car:shangpin:add')")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TShangpin tShangpin)
    {
        return toAjax(tShangpinService.insertTShangpin(tShangpin));
    }

    /**
     * 修改商品
     */
    @PreAuthorize("@ss.hasPermi('car:shangpin:edit')")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TShangpin tShangpin)
    {
        return toAjax(tShangpinService.updateTShangpin(tShangpin));
    }

    /**
     * 删除商品
     */
    @PreAuthorize("@ss.hasPermi('car:shangpin:remove')")
    @Log(title = "商品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{shangpinids}")
    public AjaxResult remove(@PathVariable Long[] shangpinids)
    {
        return toAjax(tShangpinService.deleteTShangpinByShangpinids(shangpinids));
    }
}
