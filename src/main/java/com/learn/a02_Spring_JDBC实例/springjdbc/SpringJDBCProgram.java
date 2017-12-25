package com.learn.a02_Spring_JDBC实例.springjdbc;

import com.learn.a02_Spring_JDBC实例.springjdbc.bean.Department;
import com.learn.a02_Spring_JDBC实例.springjdbc.dao.DepartmentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SpringJDBCProgram {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new
                FileSystemXmlApplicationContext("src/main/java/com/learn/a02_Spring_JDBC实例/springjdbc/spring-module.xml");
        DepartmentDAO departmentDAO = (DepartmentDAO) applicationContext.getBean("departmentDAO");

        List<Department> departments = departmentDAO.queryDepartment();
        if (departments != null && departments.size() > 0) {
            for (Department department : departments) {
                System.out.print("deptId: " + department.getDeptId());
                System.out.print(" deptNo: " + department.getDeptNo());
                System.out.print(" deptName: " + department.getDeptName());
                System.out.print(" location: " + department.getLocation());
                System.out.println();
            }
        }

    }
}
