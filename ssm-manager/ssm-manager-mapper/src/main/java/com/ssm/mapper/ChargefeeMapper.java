package com.ssm.mapper;

import com.ssm.pojo.Chargefee;
import com.ssm.pojo.ChargefeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChargefeeMapper {
    long countByExample(ChargefeeExample example);

    int deleteByExample(ChargefeeExample example);

    int deleteByPrimaryKey(Integer feeId);

    int insert(Chargefee record);

    int insertSelective(Chargefee record);

    List<Chargefee> selectByExample(ChargefeeExample example);

    Chargefee selectByPrimaryKey(Integer feeId);

    int updateByExampleSelective(@Param("record") Chargefee record, @Param("example") ChargefeeExample example);

    int updateByExample(@Param("record") Chargefee record, @Param("example") ChargefeeExample example);

    int updateByPrimaryKeySelective(Chargefee record);

    int updateByPrimaryKey(Chargefee record);
}