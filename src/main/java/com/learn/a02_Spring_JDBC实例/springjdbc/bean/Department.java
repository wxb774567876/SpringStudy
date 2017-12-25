package com.learn.a02_Spring_JDBC实例.springjdbc.bean;

public class Department {
    private long deptId;
    private String deptNo;
    private String deptName;
    private String location;

    public Department(long deptId, String deptNo, String deptName, String location) {
        this.deptId = deptId;
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
