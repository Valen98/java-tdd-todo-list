package com.booleanuk.extension;

import com.booleanuk.core.Task;
import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {
    @Test
    public void addTaskToList(){
        TodoListExtension todoList = new TodoListExtension();

        Assertions.assertTrue(todoList.add("First Task"));
        Assertions.assertTrue(todoList.add("First Task"));
    }

    @Test
    public void getTaskByIdTest() {
        TodoListExtension todoList = new TodoListExtension();

        Assertions.assertTrue(todoList.add("First Task"));
        todoList.add("Second Task");
        todoList.add("Third Task");

        Assertions.assertEquals("First Task", todoList.getTaskById(0).getName());
        Assertions.assertNotEquals("Third Task", todoList.getTaskById(0).getName());
    }

    @Test
    public void updateTaskTest() {
        TodoListExtension todoList = new TodoListExtension();

        todoList.add("First Task");
        Assertions.assertEquals("First Task", todoList.getTaskById(0).getName());
        todoList.updateTaskName(0, "Updated Task");
        Assertions.assertEquals("Updated Task", todoList.getTaskById(0).getName());
    }
}
