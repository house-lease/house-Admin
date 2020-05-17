package cn.bdqn.service.impl;

import cn.bdqn.domain.Administrator;
import cn.bdqn.mapper.AdministratorMapper;
import cn.bdqn.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator login(String name, String password) {
        return administratorMapper.selectByNameAndPassword(name, password);
    }
}
