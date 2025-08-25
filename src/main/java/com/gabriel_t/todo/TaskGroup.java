package com.gabriel_t.todo;

import java.util.ArrayList;

public class TaskGroup {

    private String groupName;
    private ArrayList<Task> tasks;

    public TaskGroup(String groupName) {
        this.groupName = groupName;
        this.tasks = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void listTasks() {
        for (Task task: tasks) {
            System.out.println(task.getTitle());
        }
    }

    public void createTask(Integer id, String title, String description) {
        this.tasks.add(new Task(id, title, description));
    }

    public void deleteTask(Integer id) {

        Integer taskID;

        for (int i = 0; i < this.tasks.size(); i++) {
            taskID = tasks.get(i).getID();
            if (taskID.equals(id)) {
                this.tasks.remove(i);
            }
        }
    }

}
