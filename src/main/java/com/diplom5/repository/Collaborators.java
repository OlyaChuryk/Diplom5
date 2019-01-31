package com.diplom5.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collaborators {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//
//    private User user1;
//    private User user2;


}
