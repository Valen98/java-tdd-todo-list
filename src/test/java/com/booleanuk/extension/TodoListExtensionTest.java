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

        Assertions.assertEquals("First Task", todoList.getTaskById(0).getName());
    }
}
