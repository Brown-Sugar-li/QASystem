package com.brownsuagr.qasystem.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.brownsuagr.qasystem.entity.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper extends BaseMapper<Question> {

    @Select("SELECT id,question,answer,keyword,mode_id FROM question")
    List<Question> getQuestionList();


}
