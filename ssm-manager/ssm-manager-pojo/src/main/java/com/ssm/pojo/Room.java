package com.ssm.pojo;

public class Room {
    private Integer roomId;

    private String roomCode;

    private String ownerId;

    private String unitId;

    private String cellId;

    private String roomType;

    private String roomStatus;

    private Long buildarea;

    private Long userarea;

    private String roomMemo;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode == null ? null : roomCode.trim();
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId == null ? null : cellId.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus == null ? null : roomStatus.trim();
    }

    public Long getBuildarea() {
        return buildarea;
    }

    public void setBuildarea(Long buildarea) {
        this.buildarea = buildarea;
    }

    public Long getUserarea() {
        return userarea;
    }

    public void setUserarea(Long userarea) {
        this.userarea = userarea;
    }

    public String getRoomMemo() {
        return roomMemo;
    }

    public void setRoomMemo(String roomMemo) {
        this.roomMemo = roomMemo == null ? null : roomMemo.trim();
    }
}