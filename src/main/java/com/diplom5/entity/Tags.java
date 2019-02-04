package com.diplom5.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tag;

    @ManyToMany
    private List<User> usernameList=new ArrayList<>();

    @ManyToOne
    private Projects projects;


    public Tags() {
    }

    public Tags(String tag, List<User> usernameList, Projects projects) {
        this.tag = tag;
        this.usernameList = usernameList;
        this.projects = projects;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getUsernameList() {
        return usernameList;
    }

    public void setUsernameList(List<User> usernameList) {
        this.usernameList = usernameList;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", usernameList=" + usernameList +
                ", projects=" + projects +
                '}';
    }
}
