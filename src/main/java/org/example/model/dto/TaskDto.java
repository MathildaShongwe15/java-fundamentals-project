package org.example.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.Status;

@Getter
@Setter
@NoArgsConstructor
public class TaskDto  {

    private Status status;
    private String description;



}
