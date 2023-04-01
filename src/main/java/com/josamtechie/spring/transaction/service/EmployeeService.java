package com.josamtechie.spring.transaction.service;

import com.josamtechie.spring.transaction.entity.Department;
import com.josamtechie.spring.transaction.entity.Employee;
import com.josamtechie.spring.transaction.repository.DepartmentRepository;
import com.josamtechie.spring.transaction.repository.EmployeeRepository;
import com.josamtechie.spring.transaction.vo.EmployeeRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Service
@EnableTransactionManagement
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public String saveEmployee(EmployeeRequestVo employeeRequestVo) {
        Department department =new Department();
        department.setDepartmentName(employeeRequestVo.getDepartmentName());
        department.setDepartmentCode(employeeRequestVo.getDepartmentCode());

        Long departmentId = departmentRepository.save(department)
                                                .getDepartmentId();

        Employee employee = new Employee();
        //Employee employee = null; //for testing Transactional annotation
        employee.setEmpName(employeeRequestVo.getEmpName());
        employee.setEmail(employeeRequestVo.getEmail());
        employee.setDepartmentId(departmentId);
        employeeRepository.save(employee);
        return "Employee is saved successfully with EmployeeId: "+employee.getEmployeeId();
    }
}
