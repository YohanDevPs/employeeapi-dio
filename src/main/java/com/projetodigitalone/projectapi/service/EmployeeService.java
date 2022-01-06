package com.projetodigitalone.projectapi.service;


import com.projetodigitalone.projectapi.dto.MessageRespondeDTO;
import com.projetodigitalone.projectapi.entities.Employee;
import com.projetodigitalone.projectapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public MessageRespondeDTO createEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return MessageRespondeDTO
                .builder()
                .message("Created Employee with ID"+ savedEmployee.getId())
                .build();
    }
}
