package com.golfapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.golfapplication.models.GolfCourse;
import com.golfapplication.models.Golfer;
import com.golfapplication.repositories.GolfCourseRepository;
import com.golfapplication.repositories.GolferRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GolfApiController {
	
	@Autowired
	GolfCourseRepository golfCourseRepository;
	@Autowired
	GolferRepository golferRepository;
	
	@PostMapping("/saveCourse")
	public GolfCourse addACourse(@RequestBody GolfCourse gc) {
		return golfCourseRepository.save(gc);	
	}
	
	@GetMapping("/findCourses")
	public List<GolfCourse> findAllCourses() {
		System.out.println(golfCourseRepository.findAll().get(0).getGolfers().get(0));
		return golfCourseRepository.findAll();	
	}
	
	@GetMapping("/findGolfers")
	public List<Golfer> findAllGolfers() {
		return golferRepository.findAll();	
	}
	
	

}
