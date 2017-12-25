package com.learn.a02_Spring_JDBC实例.springjdbc.dao;

import com.learn.a02_Spring_JDBC实例.springjdbc.bean.Department;

import java.util.List;

public interface DepartmentDAO {
    public List<Department> queryDepartment() throws Exception;
}
