package org.example.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.dto.EmployeeDto;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class BillableEmployee extends Employee{
    @Column
    int level;


    public BillableEmployee(EmployeeDto employeeDto) {
        super(employeeDto);
    }
}
