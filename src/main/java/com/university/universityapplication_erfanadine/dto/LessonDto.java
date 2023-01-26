package com.university.universityapplication_erfanadine.dto;

import com.university.universityapplication_erfanadine.entity.Book;
import com.university.universityapplication_erfanadine.entity.Student;
import com.university.universityapplication_erfanadine.entity.Teacher;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class LessonDto extends BaseEntityDto {

    private String NameOfCourse;
    private Integer universityCourseUnit;
    private Long unitOfUniversity;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

}