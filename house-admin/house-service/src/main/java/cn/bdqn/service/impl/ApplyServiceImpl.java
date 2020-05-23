package cn.bdqn.service.impl;

import cn.bdqn.domain.Apply;
import cn.bdqn.mapper.ApplyMapper;
import cn.bdqn.service.ApplyService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("applyService")
public class ApplyServiceImpl implements ApplyService {
    @Autowired
    private ApplyMapper applyMapper;
    //根据认证人名称模糊查询
    @Override
    public List<Apply> queryByUserName(String userName, int page, int size) {
        PageHelper.startPage(page,size);
        return applyMapper.selectByUserName(userName);
    }
    //根据id查询详细信息
    @Override
    public Apply queryById(Integer id) {
        return applyMapper.selectById(id);
    }
    //根据userId修改信息
    @Override
    public void updateById(Integer userId) {
        applyMapper.updateById(userId);
    }




}
