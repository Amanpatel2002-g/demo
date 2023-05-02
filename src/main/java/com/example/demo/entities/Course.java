package com.example.demo.entities;

public class Course {
    private  long id;
    private String title;
    private String description;

    public Course(long id, String title, String description) {
        this.title = title;
        this.description = description;
    }

    Course(){
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
