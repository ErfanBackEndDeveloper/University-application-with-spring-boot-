package com.university.universityapplication_erfanadine.dto;

import com.university.universityapplication_erfanadine.entity.Lesson;
import com.university.universityapplication_erfanadine.entity.Teacher;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class UnitOfUniversityDto extends BaseEntityDto {

    private String nameOfUniversity_Unit;
    private String codeOfUnit;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();

}
