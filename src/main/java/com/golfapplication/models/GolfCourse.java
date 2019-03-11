package com.golfapplication.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GolfCourse {
	
	private String courseName;
	private double courseDistance;
	@OneToMany (mappedBy="golfCourse")
	private List<Golfer> golfers;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public GolfCourse () {
		
	}
	
	public GolfCourse (String courseName, int courseDistance) {
		this.courseName=courseName;
		this.courseDistance=courseDistance;
	}
	
	public GolfCourse (String courseName, int courseDistance, List<Golfer> golfers) {
		this.courseName=courseName;
		this.courseDistance=courseDistance;
		this.golfers=golfers;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseDistance() {
		return courseDistance;
	}
	public void setCourseDistance(double courseDistance) {
		this.courseDistance = courseDistance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public List<Golfer> getGolfers() {
		return golfers;
	}

	public void setGolfers(List<Golfer> golfers) {
		this.golfers = golfers;
	}

	
}
