package com.diplom5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collaborators {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//
//    private User user1;
//    private User user2;


    public Collaborators() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Collaborators{" +
                "id=" + id +
                '}';
    }
}
