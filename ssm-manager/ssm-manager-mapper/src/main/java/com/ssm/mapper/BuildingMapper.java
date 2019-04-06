package com.ssm.mapper;

import com.ssm.pojo.Building;
import com.ssm.pojo.BuildingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuildingMapper {
    long countByExample(BuildingExample example);

    int deleteByExample(BuildingExample example);

    int deleteByPrimaryKey(Integer buildingId);

    int insert(Building record);

    int insertSelective(Building record);

    List<Building> selectByExampleWithBLOBs(BuildingExample example);

    List<Building> selectByExample(BuildingExample example);

    Building selectByPrimaryKey(Integer buildingId);

    int updateByExampleSelective(@Param("record") Building record, @Param("example") BuildingExample example);

    int updateByExampleWithBLOBs(@Param("record") Building record, @Param("example") BuildingExample example);

    int updateByExample(@Param("record") Building record, @Param("example") BuildingExample example);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKeyWithBLOBs(Building record);

    int updateByPrimaryKey(Building record);
}