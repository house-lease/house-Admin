package cn.bdqn.service.impl;

import cn.bdqn.domain.Particular;
import cn.bdqn.mapper.ParticularMapper;
import cn.bdqn.service.ParticularService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class ParticularServiceImpl implements ParticularService {
    @Autowired
    private ParticularMapper particularMapper;

    //    根据id查询
    @Override
    public Particular queryByPrimaryKey(Integer id) {
        return particularMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户id更改充值记录状态
     * @param id
     */
    @Override
    public void updateById(Integer id) {

        particularMapper.updateById(id);
    }

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    @Override
    public List<Particular> queryByUserId(Integer userId,int page,int size) {
        PageHelper.startPage(page,size);
        return particularMapper.selectByUserId(userId);
    }

}
