package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.TeacherDto;
import com.university.universityapplication_erfanadine.entity.Teacher;
import com.university.universityapplication_erfanadine.repository.FoodWeekRepo;
import com.university.universityapplication_erfanadine.repository.LessonRepo;
import com.university.universityapplication_erfanadine.repository.UnitOfUniversityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {


    @Autowired
    private LessonRepo lessonRepo;

    @Autowired
    private FoodWeekRepo foodWeekRepo;

    @Autowired
    private UnitOfUniversityRepo unitOfUniversityRepo;

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
