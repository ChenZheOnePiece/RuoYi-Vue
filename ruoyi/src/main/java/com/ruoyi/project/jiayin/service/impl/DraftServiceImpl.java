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
    public Draft selectJiayinDraftById(String id)
    {
        return draftMapper.selectJiayinDraftById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param draft 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Draft> selectJiayinDraftList(Draft draft)
    {
        return draftMapper.selectJiayinDraftList(draft);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param draft 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertJiayinDraft(Draft draft)
    {
        draft.setCreateTime(DateUtils.getNowDate());
        return draftMapper.insertJiayinDraft(draft);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param draft 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateJiayinDraft(Draft draft)
    {
        draft.setUpdateTime(DateUtils.getNowDate());
        return draftMapper.updateJiayinDraft(draft);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteJiayinDraftByIds(String[] ids)
    {
        return draftMapper.deleteJiayinDraftByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteJiayinDraftById(String id)
    {
        return draftMapper.deleteJiayinDraftById(id);
    }
}
