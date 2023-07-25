package com.criteria_builder.jpapagingsortingfiltering.repository;


import com.criteria_builder.jpapagingsortingfiltering.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
