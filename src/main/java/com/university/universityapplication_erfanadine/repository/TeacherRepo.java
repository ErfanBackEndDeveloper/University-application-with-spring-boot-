package com.university.universityapplication_erfanadine.repository;

import com.university.universityapplication_erfanadine.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    Optional<Teacher> findByFirstNameAndLastName(String firstName, String lastName);
}
