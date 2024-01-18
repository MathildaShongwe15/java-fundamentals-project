package org.example.service;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.Status;
import org.example.model.dto.TaskDto;
import org.example.model.entity.Task;

import java.util.List;


public interface TaskService {

    Task findById(Long id);

    List<Task> getAllTasks();


    Task addTask(Task task);
    Task addTask(TaskDto taskDto);

    List<Task> getTasks(Long taskId, Status status);

    List<Task> getTasks(Long taskId);



    void deleteTask(Long id);

    Task updateTask(Long id);

}
