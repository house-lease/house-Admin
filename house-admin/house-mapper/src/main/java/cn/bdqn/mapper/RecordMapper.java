package cn.bdqn.mapper;

import cn.bdqn.domain.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

    /**
     * 根据条件查询订单
     * @param params
     * @return
     */
    List<Record> selectByParams( Map<String, Object> params);
}