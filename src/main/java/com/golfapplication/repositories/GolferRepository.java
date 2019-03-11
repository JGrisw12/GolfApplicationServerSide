package com.golfapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.golfapplication.models.Golfer;

public interface GolferRepository extends JpaRepository<Golfer, Integer> {

}
