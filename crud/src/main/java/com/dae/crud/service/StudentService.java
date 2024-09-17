package com.dae.crud.service;

import com.dae.crud.entity.Student;
import com.dae.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //Create student list
    public List<Student> getStudents(){
        return studentRepository.findAll(); // search all de element and return
    }
    //Search element by id
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }
    // save and update student
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }
    //delete student
    public void delete(Long id){
        studentRepository.deleteById(id);
    }



}
