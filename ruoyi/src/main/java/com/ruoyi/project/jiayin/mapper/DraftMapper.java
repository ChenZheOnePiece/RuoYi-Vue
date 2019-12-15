package com.ruoyi.project.jiayin.mapper;


import com.ruoyi.project.jiayin.domain.Draft;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
public interface DraftMapper
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Draft selectDraftById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param Draft 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Draft> selectDraftList(Draft Draft);

    /**
     * 新增【请填写功能名称】
     * 
     * @param Draft 【请填写功能名称】
     * @return 结果
     */
    public int insertDraft(Draft Draft);

    /**
     * 修改【请填写功能名称】
     * 
     * @param Draft 【请填写功能名称】
     * @return 结果
     */
    public int updateDraft(Draft Draft);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDraftById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDraftByIds(String[] ids);
}
