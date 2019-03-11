package com.golfapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.golfapplication.models.GolfCourse;

public interface GolfCourseRepository extends JpaRepository<GolfCourse, Integer> {

}
