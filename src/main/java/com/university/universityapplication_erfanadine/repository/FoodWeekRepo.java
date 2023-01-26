package com.university.universityapplication_erfanadine.repository;

import com.university.universityapplication_erfanadine.entity.FoodWeek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodWeekRepo extends JpaRepository<FoodWeek, Long> {
    Optional<FoodWeek> findByFoodName(String foodName);
}
