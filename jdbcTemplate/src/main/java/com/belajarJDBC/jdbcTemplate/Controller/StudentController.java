package com.belajarJDBC.jdbcTemplate.Controller;

import com.belajarJDBC.jdbcTemplate.Entity.Student;
import com.belajarJDBC.jdbcTemplate.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudent(){
        return this.studentService.getAllStudent();
    }

    @RequestMapping(value = "/getbyid/{id}",method = RequestMethod.GET)
    public Student getSudentById(@PathVariable("id") int id){
        return studentService.getStudetnById(id);
    }

    @RequestMapping(value = "/removebyid/{id}",method = RequestMethod.DELETE)
    public Student removeStudentById(@PathVariable("id") int id){
        return studentService.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentsById(@RequestBody Student student){
        this.studentService.updateStudent(student);
    }

    @RequestMapping(value = "/insertodb" ,method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        this.studentService.insertStudent(student);
    }





}
