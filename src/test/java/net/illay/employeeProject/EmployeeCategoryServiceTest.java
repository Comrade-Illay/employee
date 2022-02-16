package net.illay.employeeProject;

import net.illay.employeeProject.entity.EmployeeCategory;
import net.illay.employeeProject.repository.EmployeeCategoryRepository;
import net.illay.employeeProject.service.EmployeeCategoryService;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class EmployeeCategoryServiceTest {

    @Autowired
    private EmployeeCategoryService employeeCategoryService;

    @MockBean
    private EmployeeCategoryRepository employeeCategoryRepository;

    @Test
    public void saveEmployeeCategory(){
        EmployeeCategory employeeCategory = new EmployeeCategory();
        employeeCategoryService.save(employeeCategory);
        Mockito.verify(employeeCategoryRepository, Mockito.times(1)).save(employeeCategory);
    }
}
