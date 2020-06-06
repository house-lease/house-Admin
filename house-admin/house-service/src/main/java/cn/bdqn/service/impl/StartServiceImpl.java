package cn.bdqn.service.impl;

import cn.bdqn.domain.Start;
import cn.bdqn.mapper.StartMapper;
import cn.bdqn.service.StartService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("startService")
public class StartServiceImpl  implements StartService {
    @Autowired
    private StartMapper startMapper;

   // 分页查询Start全部信息
    @Override
    public List<Start> queryAll(int page,int size) {
        PageHelper.startPage(page,size);
        return startMapper.selectAll();
    }

   //添加Start
    @Override
    public void save(Start start) {
        startMapper.insert(start);
    }
   //根据id删除
    @Override
    public void delete(Integer id) {
       startMapper.updateById(id);
    }
   //根据id查询
    @Override
    public Start selectById(Integer id) {
        return startMapper.selectByPrimaryKey(id);
    }
   //修改信息
    @Override
    public int update(Start start) {
        return startMapper.updateByPrimaryKey(start);
    }
    //验证是否与数据库数据重复
    @Override
    public int queryCount(String startName,Integer stateValue) {
        return startMapper.selectCount(startName,stateValue);
    }


}
