package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.LessonDto;
import com.university.universityapplication_erfanadine.entity.Lesson;
import com.university.universityapplication_erfanadine.repository.LessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    private LessonRepo lessonRepo;

    private LessonDto save(LessonDto lessonDto) {
        return convertLessonModelToLessonDto(lessonRepo.save(convertLessonDtoToLessonModel(lessonDto)));
    }

    private LessonDto update(LessonDto lessonDto) {
        return convertLessonModelToLessonDto(lessonRepo.save(convertLessonDtoToLessonModel(lessonDto)));
    }

    private LessonDto findById(Long id) {
        return convertLessonModelToLessonDto(lessonRepo.findById(id).orElseThrow(() ->
                new RuntimeException("not found lesson by this id : " + id)));
    }

    private LessonDto findByName(String nameOfCourse) {
        return convertLessonModelToLessonDto(lessonRepo.findByNameOfCourse(nameOfCourse).orElseThrow(() ->
                new RuntimeException("not found lesson by this name : " + nameOfCourse)));
    }


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
