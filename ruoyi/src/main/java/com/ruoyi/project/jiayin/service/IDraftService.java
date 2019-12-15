package com.ruoyi.project.jiayin.service;

import com.ruoyi.project.jiayin.domain.Draft;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
public interface IDraftService
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Draft selectJiayinDraftById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param draft 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Draft> selectJiayinDraftList(Draft draft);

    /**
     * 新增【请填写功能名称】
     * 
     * @param draft 【请填写功能名称】
     * @return 结果
     */
    public int insertJiayinDraft(Draft draft);

    /**
     * 修改【请填写功能名称】
     * 
     * @param draft 【请填写功能名称】
     * @return 结果
     */
    public int updateJiayinDraft(Draft draft);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteJiayinDraftByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteJiayinDraftById(String id);
}
