package cn.bdqn.service.impl;

import cn.bdqn.domain.Start;
import cn.bdqn.mapper.StartMapper;
import cn.bdqn.service.StartService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service()
public class StartServiceImpl  implements StartService {
    @Autowired
    private StartMapper startMapper;


    @Override
    public List<Start> queryAll(int page,int size) {
        PageHelper.startPage(page,size);
        return startMapper.selectAll();
    }
}
