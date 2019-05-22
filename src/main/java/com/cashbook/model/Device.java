package com.cashbook.model;

import java.util.Date;

public class Device {
    private Long id;

    private String seqNo;

    private String deviceVersion;

    private String softInitVersion;

    private Byte deviceType;

    private Date productDate;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private String address;

    private Byte status;

    private Date createTime;

    private Long createUserId;

    private Date lastModifyTime;

    private Long lastModifyUserId;

    private String memo;

    private String createUserName;

    private String lastModifyUserName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion == null ? null : deviceVersion.trim();
    }

    public String getSoftInitVersion() {
        return softInitVersion;
    }

    public void setSoftInitVersion(String softInitVersion) {
        this.softInitVersion = softInitVersion == null ? null : softInitVersion.trim();
    }

    public Byte getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Byte deviceType) {
        this.deviceType = deviceType;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Long getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(Long lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public String getLastModifyUserName() {
        return lastModifyUserName;
    }

    public void setLastModifyUserName(String lastModifyUserName) {
        this.lastModifyUserName = lastModifyUserName == null ? null : lastModifyUserName.trim();
    }
}