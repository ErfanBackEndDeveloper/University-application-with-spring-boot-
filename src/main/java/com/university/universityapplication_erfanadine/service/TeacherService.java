package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.LessonDto;
import com.university.universityapplication_erfanadine.dto.TeacherDto;
import com.university.universityapplication_erfanadine.entity.Teacher;
import com.university.universityapplication_erfanadine.repository.FoodWeekRepo;
import com.university.universityapplication_erfanadine.repository.LessonRepo;
import com.university.universityapplication_erfanadine.repository.TeacherRepo;
import com.university.universityapplication_erfanadine.repository.UnitOfUniversityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    private TeacherDto save(TeacherDto lessonDto) {
        return convertTeacherModelToTeacherDto(teacherRepo.save(convertTeacherDtoToTeacherModel(lessonDto)));
    }

    private TeacherDto update(TeacherDto lessonDto) {
        return convertTeacherModelToTeacherDto(teacherRepo.save(convertTeacherDtoToTeacherModel(lessonDto)));
    }

    private TeacherDto findById(Long id) {
        return convertTeacherModelToTeacherDto(teacherRepo.findById(id).orElseThrow(() ->
                new RuntimeException("not found teacher by this id : " + id)));
    }

    private TeacherDto findByName(String firstName,String lastName) {
        return convertTeacherModelToTeacherDto(teacherRepo.findByFirstNameAndLastName(firstName, lastName).orElseThrow(() ->
                new RuntimeException("not found teacher by this full firstName : " + firstName + " lastName : " + lastName)));
    }


    public TeacherDto convertTeacherModelToTeacherDto(Teacher teacher) {

        if (teacher == null) {
            return null;
        }

        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(teacher.getId());
        teacherDto.setFoodWeeks(teacher.getFoodWeeks());
        teacherDto.setLessons(teacher.getLessons());
        teacherDto.setUnitOfUniversities(teacher.getUnitOfUniversities());

        return teacherDto;
    }


    public Teacher convertTeacherDtoToTeacherModel(TeacherDto teacherDto) {
        if (teacherDto == null) {
            return null;
        }

        Teacher teacher = new Teacher();
        teacher.setId(teacherDto.getId());
        teacher.setFoodWeeks(teacherDto.getFoodWeeks());
        teacher.setLessons(teacherDto.getLessons());
        teacher.setUnitOfUniversities(teacherDto.getUnitOfUniversities());

        return teacher;
    }
}
