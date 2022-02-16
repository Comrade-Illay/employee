package net.illay.employeeProject.controller;

import net.illay.employeeProject.entity.EmployeeCategory;
import net.illay.employeeProject.service.EmployeeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service/category")
public class EmployeeCategoryController {

    @Autowired
    private EmployeeCategoryService employeeCategoryService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeCategory> getEmployeeCategory(@PathVariable("id") Long employeeCategoryId) {
        return new ResponseEntity<>(employeeCategoryService.getById(employeeCategoryId), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeCategory>> getAllEmployeeCategory() {
        return new ResponseEntity<>(employeeCategoryService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeCategory> saveEmployeeCategory(@RequestBody EmployeeCategory employeeCategory) {
        employeeCategoryService.save(employeeCategory);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeCategory> updateEmployeeCategory(@RequestBody EmployeeCategory employeeCategory) {
        return new ResponseEntity<>(employeeCategoryService.update(employeeCategory), HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeCategory> deleteEmployeeCategory(@PathVariable("id") Long employeeCategoryId) {
        employeeCategoryService.delete(employeeCategoryId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
