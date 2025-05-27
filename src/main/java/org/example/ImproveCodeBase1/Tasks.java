package org.example.ImproveCodeBase1;

import java.util.List;

public class Tasks {
    private List<String> taskList;

    public Tasks(List<String> tasks){
        this.taskList = tasks;
    }

    public void addTask(String task){
        this.taskList.add(task);
    }

    public void removeTask(String task){
        this.taskList.remove(task);
    }
}
