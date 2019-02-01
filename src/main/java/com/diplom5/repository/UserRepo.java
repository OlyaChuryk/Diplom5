package com.diplom5.repository;

import com.diplom5.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

}
