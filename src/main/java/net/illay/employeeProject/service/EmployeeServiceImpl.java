package net.illay.employeeProject.service;

import net.illay.employeeProject.entity.Employee;
import net.illay.employeeProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Cacheable(value = "employeeListCache")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }
}
