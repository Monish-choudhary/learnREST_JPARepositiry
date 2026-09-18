package com.CRUDrestlearn.learnREST.service;

import com.CRUDrestlearn.learnREST.dao.EmployeeRepository;
import com.CRUDrestlearn.learnREST.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public  EmployeeServiceImpl( EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
       Optional<Employee> result = employeeRepository.findById(id);
        Employee emp = null;
       if(result.isPresent()) {
           emp = result.get();
       }
        return emp;
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
         employeeRepository.deleteById(id);
    }
}
