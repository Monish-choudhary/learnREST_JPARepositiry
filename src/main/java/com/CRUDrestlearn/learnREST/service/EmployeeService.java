package com.CRUDrestlearn.learnREST.service;

import com.CRUDrestlearn.learnREST.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);

    void deleteById(int id);

}
