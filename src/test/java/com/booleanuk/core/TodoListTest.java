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
    public void viewTodoListTest() {
        TodoList todoList = new TodoList();
        //Test list is to make sure the list
        ArrayList<Task> testList = new ArrayList<>();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");
        //Populate the lists
        todoList.add(t1);
        todoList.add(t2);
        testList.add(t1);
        testList.add(t2);

        Assertions.assertEquals(testList, todoList.viewList());
    }

    @Test
    public void changeTaskStatusTest() {
        TodoList todoList = new TodoList();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");

        Assertions.assertFalse(t1.getTaskStatus());

        todoList.changeTaskStatus(t1);

        Assertions.assertTrue(t1.getTaskStatus());
    }
}
