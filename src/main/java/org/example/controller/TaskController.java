package org.example.controller;

import org.example.exception.EmployeeNotFoundException;
import org.example.model.dto.EmployeeDto;
import org.example.model.dto.TaskDto;
import org.example.model.entity.Employee;
import org.example.model.entity.Task;
import org.example.service.EmployeeService;
import org.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/Task")

public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks(){return taskService.getAllTasks();}

    @PostMapping("")
    public ResponseEntity<?> addTasks(@RequestBody TaskDto taskDto) {
        Task savedTask = taskService.addTask(taskDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok("deleted successfully");

        } catch (EmployeeNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> UpdateTask(@RequestBody TaskDto taskDto) {
        try {

            Task savedTask = taskService.addTask(taskDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);

        } catch (EmployeeNotFoundException ex) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);


        }

    }

    @Autowired
    private TaskService taskService;
}
