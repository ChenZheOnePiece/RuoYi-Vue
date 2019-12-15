package com.ruoyi.project.jiayin.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiayin.domain.Draft;
import com.ruoyi.project.jiayin.mapper.DraftMapper;
import com.ruoyi.project.jiayin.service.IDraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
@Service
public class DraftServiceImpl implements IDraftService
{
    @Autowired
    private DraftMapper draftMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Draft selectDraftById(String id)
    {
        return draftMapper.selectDraftById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param draft 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Draft> selectDraftList(Draft draft)
    {
        return draftMapper.selectDraftList(draft);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param draft 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDraft(Draft draft)
    {
        draft.setCreateTime(DateUtils.getNowDate());
        return draftMapper.insertDraft(draft);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param draft 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDraft(Draft draft)
    {
        draft.setUpdateTime(DateUtils.getNowDate());
        return draftMapper.updateDraft(draft);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDraftByIds(String[] ids)
    {
        return draftMapper.deleteDraftByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDraftById(String id)
    {
        return draftMapper.deleteDraftById(id);
    }
}
