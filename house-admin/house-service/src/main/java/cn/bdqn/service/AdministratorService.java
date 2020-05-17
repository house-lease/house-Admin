package cn.bdqn.service;

import cn.bdqn.domain.Administrator;

public interface AdministratorService {

    Administrator login(String name, String password);
}
