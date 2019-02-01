package com.diplom5.repository;

import com.diplom5.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {


}
