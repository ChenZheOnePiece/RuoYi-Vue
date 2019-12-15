package com.ruoyi.project.jiayin.controller;

import java.util.List;

import com.ruoyi.project.jiayin.domain.HistoryRecord;
import com.ruoyi.project.jiayin.service.IHistoryRecordService;
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
@RequestMapping("/jiayin/record")
public class HistoryRecordController extends BaseController
{
    @Autowired
    private IHistoryRecordService historyRecordService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('jiayin:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(HistoryRecord historyRecord)
    {
        startPage();
        List<HistoryRecord> list = historyRecordService.selectHistoryRecordList(historyRecord);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('jiayin:record:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HistoryRecord HistoryRecord)
    {
        List<HistoryRecord> list = historyRecordService.selectHistoryRecordList(HistoryRecord);
        ExcelUtil<HistoryRecord> util = new ExcelUtil<HistoryRecord>(HistoryRecord.class);
        return util.exportExcel(list, "record");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('jiayin:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(historyRecordService.selectHistoryRecordById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('jiayin:record:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HistoryRecord HistoryRecord)
    {
        return toAjax(historyRecordService.insertHistoryRecord(HistoryRecord));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('jiayin:record:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HistoryRecord HistoryRecord)
    {
        return toAjax(historyRecordService.updateHistoryRecord(HistoryRecord));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('jiayin:record:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(historyRecordService.deleteHistoryRecordByIds(ids));
    }
}
