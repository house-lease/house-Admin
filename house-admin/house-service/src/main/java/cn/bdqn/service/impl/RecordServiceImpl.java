package cn.bdqn.service.impl;

import cn.bdqn.domain.Record;
import cn.bdqn.mapper.RecordMapper;
import cn.bdqn.service.RecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<Record> queryRecord(Map<String, Object> params) {
        PageHelper.startPage(params.get("pageCode") == null ? 0 : (Integer) params.get("pageCode"), 8);//每页八条数据
        List<Record> records = recordMapper.selectByParams(params);
        PageInfo<Record> pageInfo = new PageInfo<>(records);
        return pageInfo;
    }

    @Override
    public Record queryRecordById(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }
}
