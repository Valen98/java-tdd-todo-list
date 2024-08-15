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

        //False in the beginning
        Assertions.assertFalse(t1.getTaskStatus());

        //Change the isComplete to true
        todoList.changeTaskStatus(t1);

        //isComplete is now true
        Assertions.assertTrue(t1.getTaskStatus());
    }

    @Test
    public void getCompletedTasksTest() {
        TodoList todoList = new TodoList();
        ArrayList<Task> listChecker = new ArrayList<>();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");
        Task t3 = new Task("Third Task");

        //Add tasks to todolist
        todoList.add(t1);
        todoList.add(t2);
        todoList.add(t3);

        //Change the status of tasks and populate a reference list to compare
        todoList.changeTaskStatus(t1);
        todoList.changeTaskStatus(t3);
        listChecker.add(t1);
        listChecker.add(t3);

        Assertions.assertEquals(listChecker, todoList.getComplete());
    }
}
