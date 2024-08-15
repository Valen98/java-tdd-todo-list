package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

class TodoListTest {

    @Test
    public void addTaskToList(){
        TodoList todoList = new TodoList();
        Task t1 = new Task("First Task");

        Assertions.assertTrue(todoList.add(t1));
        Assertions.assertFalse(todoList.add(t1));
    }

    @Test
    public void viewTodoList() {
        TodoList todoList = new TodoList();
        ArrayList<Task> testList = new ArrayList<>();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");


        todoList.add(t1);
        todoList.add(t2);
        testList.add(t1);
        testList.add(t2);

        Assertions.assertEquals(testList, todoList.viewList());
    }
}
