package com.brownsuagr.qasystem.service;
import com.brownsuagr.qasystem.entity.Model;
import com.brownsuagr.qasystem.vo.ModelVO;
import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Brown Sugar
 *
 * @ClassName: com.libnet.service.literatureService
 * @Description: 定义模块数据接口类
 * @Author: 黑糖
 * @Date: 2020-09-15 14:22
 */
public interface ModelService {

    /**
     * 描述：获取模块信息
     * @return
     */
    List<ModelVO> loadModelSumList();

    /**
     * 描述：模块信息
     * @return
     */
    List<Model> loadModelList();
}
