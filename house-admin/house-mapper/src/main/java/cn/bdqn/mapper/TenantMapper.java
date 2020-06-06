package cn.bdqn.mapper;

import cn.bdqn.domain.Tenant;

import java.util.List;

public interface TenantMapper {

    public List<Tenant> selectByHouseId(Integer houseId);


    int deleteByPrimaryKey(Integer id);

    int insert(Tenant record);

    int insertSelective(Tenant record);

    Tenant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tenant record);

    int updateByPrimaryKey(Tenant record);
}