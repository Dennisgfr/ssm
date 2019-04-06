package com.ssm.mapper;

import com.ssm.pojo.Area;
import com.ssm.pojo.AreaExample;
import com.ssm.pojo.AreaWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaMapper {
    long countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(AreaWithBLOBs record);

    int insertSelective(AreaWithBLOBs record);

    List<AreaWithBLOBs> selectByExampleWithBLOBs(AreaExample example);

    List<Area> selectByExample(AreaExample example);

    AreaWithBLOBs selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") AreaWithBLOBs record, @Param("example") AreaExample example);

    int updateByExampleWithBLOBs(@Param("record") AreaWithBLOBs record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(AreaWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AreaWithBLOBs record);

    int updateByPrimaryKey(Area record);
}