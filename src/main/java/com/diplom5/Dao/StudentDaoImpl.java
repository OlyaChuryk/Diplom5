package com.diplom5.Dao;

import com.diplom5.Entities.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Olya Churyk", "olya_churyk@ukr.net", "olya"));
                put(2, new Student(2, "Oleg", "oleg@ukr.net", "oleg"));
                put(3, new Student(3, "Anna", "anna@ukr.net", "anna"));
                put(4, new Student(4, "Olesya", "olesya@ukr.net", "olesya"));
            }
        };
    }
    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }


    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setStudentName(student.getStudentName());
        s.setEmail(student.getEmail());
        s.setPassword(student.getPassword());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(), student);

    }
}