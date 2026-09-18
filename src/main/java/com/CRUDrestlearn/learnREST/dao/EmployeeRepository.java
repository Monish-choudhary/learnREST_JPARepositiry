package com.CRUDrestlearn.learnREST.dao;

import com.CRUDrestlearn.learnREST.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
