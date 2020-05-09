package cn.bdqn.service;

import cn.bdqn.domain.Record;

import java.util.List;
import java.util.Map;

/**
 * 订单业务层
 */
public interface RecordService {
    /**
     * 保存订单
     * @param record
     */
    void save(Record record);

    /**
     * 查询订单
     * @return
     */
    List<Record> queryRecord(Map<String, Object> params);
}
