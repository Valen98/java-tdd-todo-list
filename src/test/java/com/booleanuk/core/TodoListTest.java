package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void addTaskToList(){
        TodoList todoList = new TodoList();
        Task t1 = new Task("First Task");

        Assertions.assertTrue(todoList.add(t1));
        Assertions.assertFalse(todoList.add(t1));
    }
}
