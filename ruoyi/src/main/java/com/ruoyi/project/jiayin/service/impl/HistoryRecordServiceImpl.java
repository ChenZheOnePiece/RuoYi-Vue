package com.ruoyi.project.jiayin.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiayin.domain.HistoryRecord;
import com.ruoyi.project.jiayin.mapper.HistoryRecordMapper;
import com.ruoyi.project.jiayin.service.IHistoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
@Service
public class HistoryRecordServiceImpl implements IHistoryRecordService
{
    @Autowired
    private HistoryRecordMapper historyRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public HistoryRecord selectHistoryRecordById(String id)
    {
        return historyRecordMapper.selectHistoryRecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param historyRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HistoryRecord> selectHistoryRecordList(HistoryRecord historyRecord)
    {
        return historyRecordMapper.selectHistoryRecordList(historyRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param historyRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHistoryRecord(HistoryRecord historyRecord)
    {
        historyRecord.setCreateTime(DateUtils.getNowDate());
        return historyRecordMapper.insertHistoryRecord(historyRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param historyRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHistoryRecord(HistoryRecord historyRecord)
    {
        historyRecord.setUpdateTime(DateUtils.getNowDate());
        return historyRecordMapper.updateHistoryRecord(historyRecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHistoryRecordByIds(String[] ids)
    {
        return historyRecordMapper.deleteHistoryRecordByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHistoryRecordById(String id)
    {
        return historyRecordMapper.deleteHistoryRecordById(id);
    }
}
