package com.university.universityapplication_erfanadine.dto;

import com.university.universityapplication_erfanadine.entity.FoodWeek;
import com.university.universityapplication_erfanadine.entity.Lesson;
import com.university.universityapplication_erfanadine.entity.UnitOfUniversity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class TeacherDto extends BaseInformation {

    private List<FoodWeek> foodWeeks = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();
    private List<UnitOfUniversity> unitOfUniversities = new ArrayList<>();

}
