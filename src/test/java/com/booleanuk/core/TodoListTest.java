package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void viewTaskList(){
        TodoList todoList = new TodoList();
        Task t1 = new Task("First Task");

        Assertions.assertTrue(todoList.add(t1));
        Assertions.assertTrue(todoList.add(t1));
    }
}
