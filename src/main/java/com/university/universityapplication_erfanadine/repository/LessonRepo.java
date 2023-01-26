package com.university.universityapplication_erfanadine.repository;

import com.university.universityapplication_erfanadine.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LessonRepo extends JpaRepository<Lesson,Long> {
    Optional<Lesson> findByNameOfCourse(String NameOfCourse);
}
