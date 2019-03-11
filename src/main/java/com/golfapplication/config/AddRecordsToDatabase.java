package com.golfapplication.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.golfapplication.models.GolfCourse;
import com.golfapplication.models.Golfer;
import com.golfapplication.repositories.GolfCourseRepository;
import com.golfapplication.repositories.GolferRepository;

@Configuration
public class AddRecordsToDatabase {
	

	public AddRecordsToDatabase(GolfCourseRepository gfcRepo, GolferRepository golfer) {
		
		List<Golfer> bostonCourse= new ArrayList<Golfer> ();
		bostonCourse.add(golfer.save(new Golfer(32, "John Griswold")));
		bostonCourse.get(0).setGolfCourse(gfcRepo.save(new GolfCourse("Boston",1000, bostonCourse)));
		golfer.save(bostonCourse.get(0));
	}
	
	
	
	

}
