package com.diplom5.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String projectName;

    @OneToOne
    private User user;

    @OneToMany
    private List<Tags> tagsList = new ArrayList<Tags>();

    public Projects() {
    }

    public Projects(String projectName, User user, List<Tags> tagsList) {
        this.projectName = projectName;
        this.user = user;
        this.tagsList = tagsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Tags> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<Tags> tagsList) {
        this.tagsList = tagsList;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", user=" + user +
                ", tagsList=" + tagsList +
                '}';
    }
}
