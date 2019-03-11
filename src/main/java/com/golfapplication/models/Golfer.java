package com.golfapplication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Golfer {

	private int handiCap;
	private String name;
	@ManyToOne 
	@JsonIgnore
	private GolfCourse golfCourse;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public Golfer() {
		
	}
	
	public Golfer(int handicap, String name) {
		this.handiCap=handicap;
		this.name=name;
		
	}
	
	public int getHandiCap() {
		return handiCap;
	}
	public void setHandiCap(int handiCap) {
		this.handiCap = handiCap;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public GolfCourse getGolfCourse() {
		return golfCourse;
	}

	public void setGolfCourse(GolfCourse golfCourse) {
		this.golfCourse = golfCourse;
	}
	
}
