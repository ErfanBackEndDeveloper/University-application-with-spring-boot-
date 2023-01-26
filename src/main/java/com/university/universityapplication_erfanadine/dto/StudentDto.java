package com.university.universityapplication_erfanadine.dto;

import com.university.universityapplication_erfanadine.entity.FoodWeek;
import com.university.universityapplication_erfanadine.entity.Lesson;
import com.university.universityapplication_erfanadine.entity.Wallet;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class StudentDto extends BaseInformation {

    private List<FoodWeek> foodWeeks = new ArrayList<>();

    private List<Lesson> lessons = new ArrayList<>();

    private Wallet wallet;

}
