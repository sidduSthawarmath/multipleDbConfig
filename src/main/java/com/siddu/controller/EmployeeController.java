package com.siddu.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddu.db1.domain.Employee;
import com.siddu.db1.repositories.EmployeeRepository;
import com.siddu.db2.domain.User;
import com.siddu.db2.repositories.UserRepository;

@RestController
@RequestMapping("emp")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeDao;
    

    @RequestMapping(value = "save")
    public Employee saveuserDeatils() {
        Employee obj = new Employee();
        obj.setEmpId("EMP" + new Random().nextInt());
        obj.setEmpName("name" + new Random().nextInt());
        Employee emp = employeeDao.save(obj);
        return emp;
    }
    

    @RequestMapping(value = "{empName}")
    public Employee findByEmpName(@PathVariable("empName") String empName) {
        Employee emp = employeeDao.findByEmpName(empName);
        return emp;
    }


    
    

}
