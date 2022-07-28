package com.zdy.environment.controller;

import com.zdy.environment.entity.Echarts;
import com.zdy.environment.service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhudongyang
 * @create 2022-07-25 21:52
 */

@RestController
@RequestMapping("/echarts")
public class EchartsController {

    @Autowired
    private EchartsService echartsService;

    @GetMapping
    public List<Echarts> echarts() {
        //查询数据库 所有数据
        return echartsService.echarts();
    }

}
