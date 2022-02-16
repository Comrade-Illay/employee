package net.illay.employeeProject.service;

import net.illay.employeeProject.entity.Employee;
import net.illay.employeeProject.entity.EmployeeCategory;

import java.util.List;

public interface EmployeeCategoryService {

    EmployeeCategory getById(Long id);
    List<EmployeeCategory> getAll();
    void save(EmployeeCategory employeeCategory);
    void delete(Long id);
    EmployeeCategory update(EmployeeCategory employeeCategory);
}
