package com.ssm.mapper;

import com.ssm.pojo.Parkinfo;
import com.ssm.pojo.ParkinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParkinfoMapper {
    long countByExample(ParkinfoExample example);

    int deleteByExample(ParkinfoExample example);

    int insert(Parkinfo record);

    int insertSelective(Parkinfo record);

    List<Parkinfo> selectByExample(ParkinfoExample example);

    int updateByExampleSelective(@Param("record") Parkinfo record, @Param("example") ParkinfoExample example);

    int updateByExample(@Param("record") Parkinfo record, @Param("example") ParkinfoExample example);
}