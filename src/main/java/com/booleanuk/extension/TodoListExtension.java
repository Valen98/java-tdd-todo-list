package com.booleanuk.extension;

import java.util.ArrayList;

public class TodoListExtension {
    ArrayList<TaskExtension> todoList;

    public TodoListExtension() {
        this.todoList = new ArrayList<>();
    }

    public boolean add(String name) {
        TaskExtension task = new TaskExtension(this.todoList.size(), name);
        this.todoList.add(task);
        return true;
    }

    public ArrayList<TaskExtension> viewTodos() {
        return this.todoList;
    }
}
