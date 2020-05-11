package cn.bdqn.mapper;

import cn.bdqn.domain.Start;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StartMapper {

    //添加Start
    int insert(Start record);

    int insertSelective(Start record);
   //根据id查询信息
    Start selectByPrimaryKey(Integer id);

    //修改信息
    int updateByPrimaryKey(Start record);
     //分页查询全部Start信息
     List<Start>  selectAll();

    //根据id删除信息
    void updateById(Integer id);
    //验证是否与数据库数据重复
    int selectCount(@Param("startName") String startName,@Param("stateValue") Integer stateValue);
}
