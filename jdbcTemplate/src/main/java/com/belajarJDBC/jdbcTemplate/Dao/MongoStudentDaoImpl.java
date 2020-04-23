package com.belajarJDBC.jdbcTemplate.Dao;

import com.belajarJDBC.jdbcTemplate.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongodata")
public class MongoStudentDaoImpl implements StudentDao{


    @Override
    public Collection<Student> getAllStudent() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Sammi","Male","sammidev@gmail.com","Indonesia"));
            }
        };
    }

    @Override
    public Student getStudetnById(int id) {
        return null;
    }

    @Override
    public Student removeStudentById(int id) {
        return null;
    }

    @Override
    public void updateStudentById(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
