package com.university.universityapplication_erfanadine.repository;

import com.university.universityapplication_erfanadine.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    Optional<Student> findByFirstNameAndLastName(String firstName, String lastName);
}
