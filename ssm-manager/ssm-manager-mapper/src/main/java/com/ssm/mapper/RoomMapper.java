package com.ssm.mapper;

import com.ssm.pojo.Room;
import com.ssm.pojo.RoomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomMapper {
    long countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(Integer roomId);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExampleWithBLOBs(RoomExample example);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(Integer roomId);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExampleWithBLOBs(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKeyWithBLOBs(Room record);

    int updateByPrimaryKey(Room record);
}