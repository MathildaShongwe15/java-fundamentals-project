package org.example.enums;

import org.example.model.entity.Employee;
import org.example.model.entity.Task;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.Assert.assertEquals;

public class StatusUnitTest {


    @Test
    public void testEnumValues(){
        assertEquals("New", Status.NEW.getLabel());
        assertEquals("Active", Status.ACTIVE.getLabel());
        assertEquals("Complete", Status.COMPLETE.getLabel());

    }

    //more efficient way of writing the above
    @ParameterizedTest
    @EnumSource(Status.class)
    void testEnumLabels(Status status){

        assertEquals(status.getLabel().toUpperCase(), status.name());

    }

    @Test
    public void testTask(){

         Employee employee = new Employee(1L, "jon@mail.com", "John", "Doe", "Designer");
         Task task = new Task(employee,  Status.ACTIVE, 1L, "employee status active");

         Assertions.assertEquals(1L, task.getId());
         Assertions.assertEquals(Status.ACTIVE, task.getStatus());
         Assertions.assertEquals("employee status active", task.getDescription());
         Assertions.assertEquals(employee, task.getEmployee());

    }


}
