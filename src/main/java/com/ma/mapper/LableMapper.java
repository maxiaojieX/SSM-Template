package com.ma.mapper;

import com.ma.entity.Lable;
import com.ma.entity.LableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LableMapper {
    long countByExample(LableExample example);

    int deleteByExample(LableExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Lable record);

    int insertSelective(Lable record);

    List<Lable> selectByExample(LableExample example);

    Lable selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Lable record, @Param("example") LableExample example);

    int updateByExample(@Param("record") Lable record, @Param("example") LableExample example);

    int updateByPrimaryKeySelective(Lable record);

    int updateByPrimaryKey(Lable record);
}