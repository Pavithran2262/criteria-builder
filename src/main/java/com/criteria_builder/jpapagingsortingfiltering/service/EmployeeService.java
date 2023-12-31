package com.criteria_builder.jpapagingsortingfiltering.service;


import com.criteria_builder.jpapagingsortingfiltering.model.Employee;
import com.criteria_builder.jpapagingsortingfiltering.model.EmployeePage;
import com.criteria_builder.jpapagingsortingfiltering.model.EmployeeSearchCriteria;
import com.criteria_builder.jpapagingsortingfiltering.repository.EmployeeCriteriaRepository;
import com.criteria_builder.jpapagingsortingfiltering.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria){
        return employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}