package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.LessonDto;
import com.university.universityapplication_erfanadine.entity.Lesson;
import com.university.universityapplication_erfanadine.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    private LessonRepo lessonRepo;

    @Autowired
    private UnitOfUniversityRepo unitOfUniversityRepo;


    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private BookRepo bookRepo;

    public LessonDto convertLessonModelToLessonDto(Lesson lesson) {


        if (lesson == null) {
            return null;
        }

        LessonDto lessonDto = new LessonDto();

        lessonDto.setId(lesson.getId());
        lessonDto.setNameOfCourse(lesson.getNameOfCourse());
        lessonDto.setUniversityCourseUnit(lesson.getUniversityCourseUnit());
        lessonDto.setUnitOfUniversity(lesson.getUnitOfUniversity().getId());
        lessonDto.setStudents(lesson.getStudents());
        lessonDto.setTeachers(lesson.getTeachers());
        lessonDto.setBooks(lesson.getBooks());


        return lessonDto;
    }


    public Lesson convertLessonDtoToLessonModel(LessonDto lessonDto) {

        if (lessonDto == null) {
            return null;
        }

        Lesson lesson = new Lesson();

        lesson.setId(lessonDto.getId());
        lesson.setNameOfCourse(lessonDto.getNameOfCourse());
        lesson.setUniversityCourseUnit(lessonDto.getUniversityCourseUnit());
        lesson.setStudents(lessonDto.getStudents());
        lesson.setTeachers(lessonDto.getTeachers());
        lesson.setBooks(lessonDto.getBooks());

        return lesson;
    }
}
