package com.brownsuagr.qasystem.service.impl;

import com.brownsuagr.qasystem.entity.Model;
import com.brownsuagr.qasystem.mapper.ModelMapper;
import com.brownsuagr.qasystem.service.ModelService;
import com.brownsuagr.qasystem.vo.ModelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Copyright: Copyright (c) 2020 Brown Sugar
 *
 * @ClassName: com.libnet.service.impl.ModelServiceImpl
 * @Description: 业务层（实现）-模块数据呈现
 * @Author: 黑糖
 * @Date: 2020-09-15 16:54
 */
@Service
public class ModelServiceImpl implements ModelService {

//    @Autowired
//    private RedisTemplate redisTemplate;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * 描述：获取模块和对应的问题数量
     * @return
     */
    @Override
    public List<ModelVO> loadModelSumList() {
        return modelMapper.getModeAndSumList();
    }

    @Override
    public List<Model> loadModelList() {
        return modelMapper.getModeList();
    }
}
