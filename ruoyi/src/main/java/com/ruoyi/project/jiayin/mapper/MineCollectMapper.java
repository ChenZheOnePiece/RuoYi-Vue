package com.ruoyi.project.jiayin.mapper;

import com.ruoyi.project.jiayin.domain.MineCollect;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
public interface MineCollectMapper
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public MineCollect selectMineCollectById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param mineCollect 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MineCollect> selectMineCollectList(MineCollect mineCollect);

    /**
     * 新增【请填写功能名称】
     * 
     * @param mineCollect 【请填写功能名称】
     * @return 结果
     */
    public int insertMineCollect(MineCollect mineCollect);

    /**
     * 修改【请填写功能名称】
     * 
     * @param mineCollect 【请填写功能名称】
     * @return 结果
     */
    public int updateMineCollect(MineCollect mineCollect);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteMineCollectById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMineCollectByIds(String[] ids);
}
