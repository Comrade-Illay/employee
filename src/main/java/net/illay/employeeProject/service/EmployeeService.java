package net.illay.employeeProject.service;

import net.illay.employeeProject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getById(Long id);
    List<Employee> getAll();
    void save(Employee employee);
    void delete(Long id);
    Employee update(Employee employee);
}
