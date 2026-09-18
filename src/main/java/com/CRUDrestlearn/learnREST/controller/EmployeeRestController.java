package com.CRUDrestlearn.learnREST.controller;


import com.CRUDrestlearn.learnREST.entity.Employee;
import com.CRUDrestlearn.learnREST.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired

    private EmployeeService employeeService;

    public  EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getEmployees")
    public List<Employee> getAllEmployee() {
//        System.out.println(employeeDAO.getClass());
        return employeeService.findAll();
//        return  employeeDAOJPA.findAll();
    }

    @GetMapping("/findEmployee/{id}")
    public Employee getEmployeeById(@PathVariable ("id") int studentId) {
        Employee emp = employeeService.findById(studentId);
        System.out.println(emp);
        if(emp == null) {
            throw new RuntimeException("Employee not found");
        }
        return emp;
    }

    @PostMapping("/saveEmployee")
    public Employee saveEmployee( @RequestBody  Employee e){
        e.setId(null);
        Employee newEmp = employeeService.save(e);
        System.out.println(newEmp);
        return newEmp;
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee( @RequestBody  Employee e){

        Employee newEmp = employeeService.save(e);
        System.out.println(newEmp);
        return newEmp;
    }
}
