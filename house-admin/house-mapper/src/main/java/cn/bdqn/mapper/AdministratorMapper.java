package cn.bdqn.mapper;

import cn.bdqn.domain.Administrator;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员
 */
public interface AdministratorMapper {

    Administrator selectByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
