package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.StudentDto;
import com.university.universityapplication_erfanadine.entity.Student;
import com.university.universityapplication_erfanadine.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    private StudentDto save(StudentDto lessonDto) {
        return convertStudentModelToStudentDto(studentRepo.save(convertStudentDtoToStudentModel(lessonDto)));
    }

    private StudentDto update(StudentDto lessonDto) {
        return convertStudentModelToStudentDto(studentRepo.save(convertStudentDtoToStudentModel(lessonDto)));
    }

    private StudentDto findById(Long id) {
        return convertStudentModelToStudentDto(studentRepo.findById(id).orElseThrow(() ->
                new RuntimeException("not found student by this id : " + id)));
    }

    private StudentDto findByName(String firstName, String lastName) {
        return convertStudentModelToStudentDto(studentRepo.findByFirstNameAndLastName(firstName, lastName).orElseThrow(() ->
                new RuntimeException("not found student by this full firstName : " + firstName + " lastName : " + lastName)));
    }



    public StudentDto convertStudentModelToStudentDto(Student student) {

        if (student == null) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId(student.getId());
        studentDto.setFoodWeeks(student.getFoodWeeks());
        studentDto.setLessons(student.getLessons());
        studentDto.setWallet(student.getWallet());

        return studentDto;
    }


    public Student convertStudentDtoToStudentModel(StudentDto studentDto) {

        if (studentDto == null) {
            return null;
        }

        Student student = new Student();

        student.setId(studentDto.getId());
        student.setFoodWeeks(studentDto.getFoodWeeks());
        student.setLessons(studentDto.getLessons());
        student.setWallet(studentDto.getWallet());

        return student;
    }

}
