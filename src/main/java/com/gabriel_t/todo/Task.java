package com.gabriel_t.todo;

public class Task {

    private Integer id;
    private String title;
    private String description;
    private Boolean completed;

    public Task(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public Integer getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
    return completed;
    }
}
