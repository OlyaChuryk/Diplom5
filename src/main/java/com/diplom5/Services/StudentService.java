package com.diplom5.Services;

import com.diplom5.Dao.StudentDaoImpl;
import com.diplom5.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDaoImpl studentDaoImpl;

    public Collection<Student> getAllStudents(){
        return this.studentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDaoImpl.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDaoImpl.insertStudentToDb(student);
    }
}
