package com.university.universityapplication_erfanadine.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
public class FoodWeek extends BaseEntity{

    private String foodName;

    @Enumerated(EnumType.STRING)
    private Days days;

    @Temporal(TemporalType.DATE)
    private Date foodDeliveryDateToCustomer;

    @Temporal(TemporalType.TIME)
    private Date foodDeliveryTimeToCustomer;

    private Boolean isReceived;

    private Boolean FoodIsReady;

    @ManyToMany(mappedBy = "foodWeeks")
    private List<Student> students = new ArrayList<>();

    @ManyToMany(mappedBy = "foodWeeks")
    private List<Teacher> teachers = new ArrayList<>();

}