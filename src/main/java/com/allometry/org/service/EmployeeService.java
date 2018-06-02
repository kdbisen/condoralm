package com.allometry.org.service;
import com.allometry.org.daoimpl.EmployeeRepository;
import com.allometry.org.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {



    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public void save(Employee emp){
        employeeRepository.save(emp);
    }
}
