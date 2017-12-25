package com.learn.a02_Spring_JDBC实例.springjdbc.daoimpl;

import com.learn.a02_Spring_JDBC实例.springjdbc.bean.Department;
import com.learn.a02_Spring_JDBC实例.springjdbc.dao.DepartmentDAO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {
    private DataSource dataSource;
    public List<Department>  queryDepartment() throws Exception {
        Connection conn = dataSource.getConnection();
        String sql = "select dept_id,dept_name,dept_no,location from department";

        Statement smt = conn.createStatement();
        ResultSet resultSet = smt.executeQuery(sql);
        List<Department> list = new ArrayList<Department>();
        while (resultSet.next()) {
            long deptId = resultSet.getLong("dept_id");
            String deptNo = resultSet.getString("dept_no");
            String deptName = resultSet.getString("dept_name");
            String location = resultSet.getString("location");
            Department department = new Department(deptId, deptNo, deptName, location);
            list.add(department);
        }
        return list;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
