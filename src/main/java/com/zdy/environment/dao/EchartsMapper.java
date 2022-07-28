package com.zdy.environment.dao;

import com.zdy.environment.entity.Echarts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhudongyang
 * @create 2022-07-25 21:59
 */
@Mapper
@Repository
public interface EchartsMapper {
    List<Echarts> selectList();
}
