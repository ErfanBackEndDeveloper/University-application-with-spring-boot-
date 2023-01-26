package com.university.universityapplication_erfanadine.repository;

import com.university.universityapplication_erfanadine.entity.UnitOfUniversity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnitOfUniversityRepo extends JpaRepository<UnitOfUniversity,Long> {
    Optional<UnitOfUniversity> findByNameOfUniversity_Unit(String nameOfUniversity_Unit);
}
