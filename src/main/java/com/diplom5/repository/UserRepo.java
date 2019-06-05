package com.diplom5.repository;

import com.diplom5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    User findByUsername(String username);
    User findById(int id);
    List<User> findAll();
}
