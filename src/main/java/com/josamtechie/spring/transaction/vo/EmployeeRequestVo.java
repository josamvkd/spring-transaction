package com.josamtechie.spring.transaction.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestVo {

    private String empName;
    private String email;
    private String departmentName;
    private Long departmentCode;
}
