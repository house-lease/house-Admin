package cn.bdqn.service;


import cn.bdqn.domain.Start;

import java.util.List;

public interface StartService {

    List<Start> queryAll(int page,int size);

}
