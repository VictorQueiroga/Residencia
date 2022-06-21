package com.coursequeiroga.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursequeiroga.course.entities.FoodComplaint;


public interface FoodComplaintRepositoryJDBC extends JpaRepository<FoodComplaint, Long> {

}
