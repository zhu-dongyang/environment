package com.zdy.environment.service;

import com.zdy.environment.dao.EchartsMapper;
import com.zdy.environment.entity.Echarts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author zhudongyang
 * @create 2022-07-28 10:41
 */
@Service
public class EchartsService {

    @Autowired
    private EchartsMapper echartsMapper;

    public List<Echarts> echarts() {
        //查询数据库 所有数据
        return echartsMapper.selectList();
    }
}
