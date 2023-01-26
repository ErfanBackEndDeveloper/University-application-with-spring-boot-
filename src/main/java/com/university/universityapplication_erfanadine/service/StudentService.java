package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.StudentDto;
import com.university.universityapplication_erfanadine.entity.FoodWeek;
import com.university.universityapplication_erfanadine.entity.Lesson;
import com.university.universityapplication_erfanadine.entity.Student;
import com.university.universityapplication_erfanadine.repository.FoodWeekRepo;
import com.university.universityapplication_erfanadine.repository.LessonRepo;
import com.university.universityapplication_erfanadine.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private LessonRepo lessonRepo;

    @Autowired
    private FoodWeekRepo foodWeekRepo;


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
