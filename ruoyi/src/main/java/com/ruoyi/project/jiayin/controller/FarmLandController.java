package com.ruoyi.project.jiayin.controller;

import java.util.List;

import com.ruoyi.project.jiayin.domain.FarmLand;
import com.ruoyi.project.jiayin.service.IFarmLandService;
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
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
@RestController
@RequestMapping("/jiayin/farmland")
public class FarmLandController extends BaseController
{
    @Autowired
    private IFarmLandService farmLandService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('jiayin:farmland:list')")
    @GetMapping("/list")
    public TableDataInfo list(FarmLand FarmLand)
    {
        startPage();
        List<FarmLand> list = farmLandService.selectFarmLandList(FarmLand);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('jiayin:farmland:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FarmLand FarmLand)
    {
        List<FarmLand> list = farmLandService.selectFarmLandList(FarmLand);
        ExcelUtil<FarmLand> util = new ExcelUtil<FarmLand>(FarmLand.class);
        return util.exportExcel(list, "land");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('jiayin:farmland:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(farmLandService.selectFarmLandById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('jiayin:farmland:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FarmLand FarmLand)
    {
        return toAjax(farmLandService.insertFarmLand(FarmLand));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('jiayin:farmland:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FarmLand FarmLand)
    {
        return toAjax(farmLandService.updateFarmLand(FarmLand));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('jiayin:farmland:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(farmLandService.deleteFarmLandByIds(ids));
    }
}
