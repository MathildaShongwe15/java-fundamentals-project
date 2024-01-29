package org.example.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {



    private String email;

    private String firstName;

    private String lastName;

    private String position;

void Employee (EmployeeDto employeeDto){

    this.setEmail(employeeDto.getEmail());
    this.setFirstName(employeeDto.getFirstName());
    this.setPosition(employeeDto.getPosition());
    this.setLastName(employeeDto.getLastName());
}

}
