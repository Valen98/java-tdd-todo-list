package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public boolean add(Task task) {
        if(this.todoList.contains(task)) {
            return false;
        }else {
            this.todoList.add(task);
            return true;
        }
    }

    public ArrayList<Task> viewList() {
        return this.todoList;
    }

    public void changeTaskStatus(Task task) {
        task.changeStatus();
    }
}
