package com.university.universityapplication_erfanadine.dto;

import com.university.universityapplication_erfanadine.entity.Days;
import com.university.universityapplication_erfanadine.entity.Student;
import com.university.universityapplication_erfanadine.entity.Teacher;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class FoodWeekDto extends BaseEntityDto {

    private Long id;

    private String foodName;

    private Days days;

    private Date foodDeliveryDateToCustomer;

    private Date foodDeliveryTimeToCustomer;

    private Boolean isReceived;

    private Boolean FoodIsReady;

    private List<Student> students = new ArrayList<>();

    private List<Teacher> teachers = new ArrayList<>();

}
