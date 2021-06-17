package com.brownsuagr.qasystem.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.brownsuagr.qasystem.entity.Question;
import com.brownsuagr.qasystem.vo.QuestionModelVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionModelMapper extends BaseMapper<QuestionModelVO> {

    @Select("SELECT question,q.answer,q.keyword,m.name\n" +
            "FROM question q\n" +
            "RIGHT JOIN model m\n" +
            "ON q.mode_id = m.id\n" +
            "ORDER BY rand()\n" +
            "LIMIT 1")
    List<QuestionModelVO> getOneDataRandom();

    @Select("SELECT question,q.answer,q.keyword,m.name\n" +
            "FROM question q\n" +
            "RIGHT JOIN model m\n" +
            "ON q.mode_id = m.id\n" +
            "WHERE q.id = #{id}")
    List<QuestionModelVO> getOneDataFromModel(@Param("id") Integer questionId);
}
