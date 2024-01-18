package org.example.controller;

import org.example.exception.EmployeeNotFoundException;
import org.example.model.dto.EmployeeDto;
import org.example.model.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/employee")

public class EmployeeController {
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeId(@PathVariable Long id) {

        try {
            Employee employee = employeeService.findById(id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } catch (EmployeeNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        }
    }

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("")
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee savedEmployee = employeeService.addEmployee(employeeDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok("deleted successfully");

        } catch (EmployeeNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> UpdateEmployee(@RequestBody EmployeeDto employeeDto) {
        try {

            Employee savedEmployee = employeeService.addEmployee(employeeDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);

        } catch (EmployeeNotFoundException ex) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);


        }

    }


}
