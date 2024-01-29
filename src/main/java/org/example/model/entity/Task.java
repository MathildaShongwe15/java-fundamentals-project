package org.example.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.Status;
import org.example.model.dto.EmployeeDto;
import org.example.model.dto.TaskDto;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @ManyToOne
    @JoinColumn(name = "employee_Id")
    private Employee employee;


    private Status status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    public Task(TaskDto taskDto) {
         this.status = taskDto.getStatus();
         this.description = taskDto.getDescription();

    }
}