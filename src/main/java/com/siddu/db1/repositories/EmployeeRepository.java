package com.siddu.db1.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siddu.db1.domain.Employee;
import com.siddu.db2.domain.User;

@Transactional
@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Long>{

    Employee findByEmpName(String empName);

    
    

    
}
