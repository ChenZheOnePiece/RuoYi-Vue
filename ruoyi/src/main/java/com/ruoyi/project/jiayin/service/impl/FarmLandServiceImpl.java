package com.ruoyi.project.jiayin.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiayin.domain.FarmLand;
import com.ruoyi.project.jiayin.mapper.FarmLandMapper;
import com.ruoyi.project.jiayin.service.IFarmLandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
@Service
public class FarmLandServiceImpl implements IFarmLandService
{
    @Autowired
    private FarmLandMapper farmLandMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public FarmLand selectFarmLandById(String id)
    {
        return farmLandMapper.selectFarmLandById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param FarmLand 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FarmLand> selectFarmLandList(FarmLand FarmLand)
    {
        return farmLandMapper.selectFarmLandList(FarmLand);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param FarmLand 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFarmLand(FarmLand FarmLand)
    {
        FarmLand.setCreateTime(DateUtils.getNowDate());
        return farmLandMapper.insertFarmLand(FarmLand);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param FarmLand 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFarmLand(FarmLand FarmLand)
    {
        FarmLand.setUpdateTime(DateUtils.getNowDate());
        return farmLandMapper.updateFarmLand(FarmLand);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFarmLandByIds(String[] ids)
    {
        return farmLandMapper.deleteFarmLandByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFarmLandById(String id)
    {
        return farmLandMapper.deleteFarmLandById(id);
    }
}
