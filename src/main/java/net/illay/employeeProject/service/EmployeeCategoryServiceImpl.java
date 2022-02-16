package net.illay.employeeProject.service;

import net.illay.employeeProject.entity.EmployeeCategory;
import net.illay.employeeProject.repository.EmployeeCategoryRepository;
import net.illay.employeeProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeCategoryServiceImpl implements EmployeeCategoryService{

    @Autowired
    private EmployeeCategoryRepository employeeCategoryRepository;

    public EmployeeCategory getById(Long id) {
        return employeeCategoryRepository.findById(id).get();
    }

    public List<EmployeeCategory> getAll() {
        return employeeCategoryRepository.findAll();
    }

    public void save(EmployeeCategory employeeCategory) {
        employeeCategoryRepository.save(employeeCategory);
    }

    public void delete(Long id) {
        employeeCategoryRepository.deleteById(id);
    }

    public EmployeeCategory update(EmployeeCategory employeeCategory) {
        return employeeCategoryRepository.save(employeeCategory);
    }
}
