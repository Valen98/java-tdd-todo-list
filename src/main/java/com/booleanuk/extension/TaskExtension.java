package com.booleanuk.extension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class TaskExtension {
    int id;
    String name;
    boolean isComplete;
    LocalDateTime date;

    public TaskExtension(int id, String name) {
        this.id = id;
        this.name = name;
        this.isComplete = false;
        this.date = LocalDateTime.now();
    }

    public String getName() {
        return this.name;
    }

    public String getDateString() {
        return date.toString();
    }

    public boolean getTaskStatus() {
        return this.isComplete;
    }

    public void changeStatus() {
        this.isComplete = !this.isComplete;
    }

    public void updateName(String newName) {
        this.name = newName;
    }
}
