package cn.bdqn.service.impl;

import cn.bdqn.domain.Record;
import cn.bdqn.mapper.RecordMapper;
import cn.bdqn.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;
    @Override
    public void save(Record record) {
        recordMapper.insert(record);
    }

    @Override
    public List<Record> queryRecord(Map<String, Object> params) {
        System.out.println(params);
        return recordMapper.selectByParams(params);
    }
}
