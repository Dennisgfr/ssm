package com.ssm.mapper;

import com.ssm.pojo.Repair;
import com.ssm.pojo.RepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepairMapper {
    long countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(Integer repairId);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExampleWithBLOBs(RepairExample example);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(Integer repairId);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExampleWithBLOBs(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKeyWithBLOBs(Repair record);

    int updateByPrimaryKey(Repair record);
}