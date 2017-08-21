package com.allometry.org.service;
import com.allometry.org.daoimpl.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {



    @Autowired
    private EmployeeRepository employeeRepository;

}
