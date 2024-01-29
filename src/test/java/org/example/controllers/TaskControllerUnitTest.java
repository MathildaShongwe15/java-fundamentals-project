package org.example.controllers;


import org.example.model.entity.Task;
import org.example.repository.EmployeeRepository;
import org.example.repository.TaskRepository;
import org.example.service.TaskServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest

public class TaskControllerUnitTest {

   // private TaskServiceImpl taskServiceimpl;

    @Autowired
    private MockMvc mvc;

    @Mock
    private TaskRepository taskRepository;


//    @Mock
//    private TaskServiceImpl taskServiceimpl;
//    @InjectMocks
//    private TaskServiceImpl taskService;
//
//    @Before
//    public void setUp(){
//        taskRepository = Mockito.mock(TaskRepository.class);
//        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
//
//    @Test
//    public void getTasksTest() throws Exception{
//
//      Task testTask = new Task("ACTIVE", "Status is active");
//      when(taskService.getAllTasks().thenReturn)
//
//        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
//                        .accept(MediaType.APPLICATION_JSON_VALUE))
//                .andReturn();
//
//        int status = mvcResult.getResponse().getStatus();
//        assertEquals(200, status);
//    }
}
