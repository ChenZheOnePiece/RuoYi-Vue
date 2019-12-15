package com.ruoyi.project.jiayin.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiayin.domain.MineCollect;
import com.ruoyi.project.jiayin.mapper.MineCollectMapper;
import com.ruoyi.project.jiayin.service.IMineCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
@Service
public class MineCollectServiceImpl implements IMineCollectService
{
    @Autowired
    private MineCollectMapper mineCollectMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public MineCollect selectMineCollectById(String id)
    {
        return mineCollectMapper.selectMineCollectById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param mineCollect 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MineCollect> selectMineCollectList(MineCollect mineCollect)
    {
        return mineCollectMapper.selectMineCollectList(mineCollect);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param mineCollect 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMineCollect(MineCollect mineCollect)
    {
        mineCollect.setCreateTime(DateUtils.getNowDate());
        return mineCollectMapper.insertMineCollect(mineCollect);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param mineCollect 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMineCollect(MineCollect mineCollect)
    {
        mineCollect.setUpdateTime(DateUtils.getNowDate());
        return mineCollectMapper.updateMineCollect(mineCollect);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteMineCollectByIds(String[] ids)
    {
        return mineCollectMapper.deleteMineCollectByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteMineCollectById(String id)
    {
        return mineCollectMapper.deleteMineCollectById(id);
    }
}
