package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.Status;
import org.example.model.dto.EmployeeDto;
@Getter
@Setter
@Entity
public class Task {
    @ManyToOne
    @JoinColumn(name = "employee_Id")
    private Employee employee;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private Status status;




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

}