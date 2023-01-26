package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.FoodWeekDto;
import com.university.universityapplication_erfanadine.entity.FoodWeek;
import com.university.universityapplication_erfanadine.repository.FoodWeekRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodWeekService {

    @Autowired
    private FoodWeekRepo foodWeekRepo;

    private FoodWeekDto save(FoodWeekDto foodWeekDto) {
        return convertFoodModelToFoodDto(foodWeekRepo.save(convertFoodDtoToFoodModel(foodWeekDto)));
    }

    private FoodWeekDto update(FoodWeekDto foodWeekDto) {
        return convertFoodModelToFoodDto(foodWeekRepo.save(convertFoodDtoToFoodModel(foodWeekDto)));
    }

    private FoodWeekDto findById(Long id) {
        return convertFoodModelToFoodDto(foodWeekRepo.findById(id).orElseThrow(() ->
                new RuntimeException("not found foodWeek by this id : " + id)));
    }

    private FoodWeekDto findByName(String foodName) {
        return convertFoodModelToFoodDto(foodWeekRepo.findByFoodName(foodName).orElseThrow(() ->
                new RuntimeException("not found foodWeek by this name : " + foodName)));
    }


//    *********************************************************************************
//    *********************************************************************************

    public FoodWeekDto convertFoodModelToFoodDto(FoodWeek foodWeek) {


        if (foodWeek == null) {
            return null;
        }

        FoodWeekDto foodWeekDto = new FoodWeekDto();

        foodWeekDto.setId(foodWeek.getId());
        foodWeekDto.setFoodName(foodWeek.getFoodName());
        foodWeekDto.setDays(foodWeek.getDays());
        foodWeekDto.setFoodDeliveryDateToCustomer(foodWeek.getFoodDeliveryDateToCustomer());
        foodWeekDto.setFoodDeliveryTimeToCustomer(foodWeek.getFoodDeliveryTimeToCustomer());
        foodWeekDto.setIsReceived(foodWeek.getIsReceived());
        foodWeekDto.setFoodIsReady(foodWeek.getFoodIsReady());
        foodWeekDto.setTeachers(foodWeek.getTeachers());
        foodWeekDto.setStudents(foodWeek.getStudents());


        return foodWeekDto;
    }


    public FoodWeek convertFoodDtoToFoodModel(FoodWeekDto foodWeekDto) {

        if (foodWeekDto == null) {
            return null;
        }

        FoodWeek foodWeek = new FoodWeek();

        foodWeek.setId(foodWeekDto.getId());
        foodWeek.setFoodName(foodWeekDto.getFoodName());
        foodWeek.setDays(foodWeekDto.getDays());
        foodWeek.setFoodDeliveryDateToCustomer(foodWeekDto.getFoodDeliveryDateToCustomer());
        foodWeek.setFoodDeliveryTimeToCustomer(foodWeekDto.getFoodDeliveryTimeToCustomer());
        foodWeek.setIsReceived(foodWeekDto.getIsReceived());
        foodWeek.setFoodIsReady(foodWeekDto.getFoodIsReady());
        foodWeek.setTeachers(foodWeekDto.getTeachers());
        foodWeek.setStudents(foodWeekDto.getStudents());

        return foodWeek;
    }
}
