package com.coursequeiroga.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursequeiroga.course.entities.AnimalComplaint;

public interface AnimalComplaintRepositoryJDBC extends JpaRepository<AnimalComplaint, Long> {

}
