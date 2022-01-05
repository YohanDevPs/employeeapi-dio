package com.projetodigitalone.projectapi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Ponto de entrada do projeto

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @GetMapping
    public String getBook(){
        return "API Rest!";
    }
}
