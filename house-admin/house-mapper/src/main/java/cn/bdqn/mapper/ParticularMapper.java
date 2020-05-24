package cn.bdqn.mapper;

import cn.bdqn.domain.Particular;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParticularMapper {




    //根据id查询
    List<Particular> selectByPrimaryKey(Integer id);



    //    根据id删除
    void updateById(Integer id);

    //    根据phone查询
    public List<Particular> selectByUserId(String phone);
  //根据电话和id查询
    List<Particular> selectByIdAndPhone(@Param("phone") String phone, @Param("id")Integer id);
   //查询全部
    List<Particular> selectAll();
}