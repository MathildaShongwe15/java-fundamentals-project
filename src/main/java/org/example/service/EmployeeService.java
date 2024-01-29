package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.dto.EmployeeDto;
import org.example.model.entity.Employee;

import java.util.List;


public interface EmployeeService {

    Employee findById(Long id);

    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);

    Employee addEmployee(EmployeeDto employeeDto);

    Employee updateEmployee(Long id);

    void deleteEmployee(Long id);
}
