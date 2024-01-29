package org.example.services;


import org.example.model.dto.EmployeeDto;
import org.example.model.entity.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest

public class EmployeeServiceUnitTest{

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    public void getAllEmployeeTest(){

        List<Employee> expectedEmployees = Collections.singletonList(new Employee(0L, "guy@mail.com", "john","Doe", "designer"));

        when(employeeRepository.findAll()).thenReturn(expectedEmployees);


        List<Employee>resultEmployees = employeeService.getAllEmployees();
        Assert.assertEquals(expectedEmployees, resultEmployees);
    }

    @Test
    public void addEmployeeTest(){
        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFirstName("John");
        employeeDto.setLastName("John");
        employeeDto.setPosition("John");
        employeeDto.setEmail("john@mail.com");

        Employee employee = new Employee(employeeDto);

        Assertions.assertEquals(employeeService.addEmployee(employee));

    }

    @Test
    public void deleteEmployeesTest(){
        Employee employee = new Employee();
        employee.setId(1L);

        employeeRepository.deleteById(employee.getId());

        verify(employeeRepository).deleteById(employee.getId());

    }

}
