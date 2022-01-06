package com.projetodigitalone.projectapi.controller;


import com.projetodigitalone.projectapi.dto.MessageRespondeDTO;
import com.projetodigitalone.projectapi.entities.Employee;
import com.projetodigitalone.projectapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//Ponto de entrada do projeto

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageRespondeDTO createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}
