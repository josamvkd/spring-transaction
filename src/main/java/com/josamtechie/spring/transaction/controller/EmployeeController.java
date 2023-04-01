package com.josamtechie.spring.transaction.controller;

import com.josamtechie.spring.transaction.service.EmployeeService;
import com.josamtechie.spring.transaction.vo.EmployeeRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public String saveEmployee(@RequestBody EmployeeRequestVo employeeRequestVo){
        return employeeService.saveEmployee(employeeRequestVo);
    }
}
