package com.diplom5.Repos;

import com.diplom5.Entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {

}
