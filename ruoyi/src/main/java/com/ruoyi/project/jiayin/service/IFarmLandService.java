package com.ruoyi.project.jiayin.service;

import com.ruoyi.project.jiayin.domain.FarmLand;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
public interface IFarmLandService
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public FarmLand selectFarmLandById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param farmLand 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FarmLand> selectFarmLandList(FarmLand farmLand);

    /**
     * 新增【请填写功能名称】
     * 
     * @param farmLand 【请填写功能名称】
     * @return 结果
     */
    public int insertFarmLand(FarmLand farmLand);

    /**
     * 修改【请填写功能名称】
     * 
     * @param farmLand 【请填写功能名称】
     * @return 结果
     */
    public int updateFarmLand(FarmLand farmLand);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFarmLandByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFarmLandById(String id);
}
