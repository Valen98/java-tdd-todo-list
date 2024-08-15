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

}
