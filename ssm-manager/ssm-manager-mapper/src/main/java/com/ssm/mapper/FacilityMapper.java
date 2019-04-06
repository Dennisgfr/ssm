package com.ssm.mapper;

import com.ssm.pojo.Facility;
import com.ssm.pojo.FacilityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FacilityMapper {
    long countByExample(FacilityExample example);

    int deleteByExample(FacilityExample example);

    int deleteByPrimaryKey(Integer facilityId);

    int insert(Facility record);

    int insertSelective(Facility record);

    List<Facility> selectByExample(FacilityExample example);

    Facility selectByPrimaryKey(Integer facilityId);

    int updateByExampleSelective(@Param("record") Facility record, @Param("example") FacilityExample example);

    int updateByExample(@Param("record") Facility record, @Param("example") FacilityExample example);

    int updateByPrimaryKeySelective(Facility record);

    int updateByPrimaryKey(Facility record);
}