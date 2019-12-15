package com.ruoyi.project.jiayin.service;

import com.ruoyi.project.jiayin.domain.HistoryRecord;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
public interface IHistoryRecordService
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HistoryRecord selectHistoryRecordById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param historyRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HistoryRecord> selectHistoryRecordList(HistoryRecord historyRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param historyRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertHistoryRecord(HistoryRecord historyRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param historyRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateHistoryRecord(HistoryRecord historyRecord);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHistoryRecordByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHistoryRecordById(String id);
}
