package com.coursequeiroga.course.config;

import java.time.Instant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coursequeiroga.course.entities.AnimalComplaint;
import com.coursequeiroga.course.entities.Complaint;
import com.coursequeiroga.course.entities.OtherComplaint;
import com.coursequeiroga.course.resources.HealthWatcherFacade;



@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private HealthWatcherFacade healthWatcher;
	
	public void run(String... args) throws Exception {
		
		Complaint u1 = new AnimalComplaint(null, "dd", "oo", "jj", "ff","187","bairro1", "PE", "Recife", "asasas","a@gmail.com","race1", 3,Instant.now(), "Address1", "Comp1", "Bairro2","Recife","PE", "3445666","1223333", "d@gmail.com");
		Complaint u2 = new OtherComplaint(null, "dd", "oo", "jj", "ff","187","bairro1", "PE", "Recife", "asasas","a@gmail.com", 3  , "B1", "occup", "address", "comp", "bairro3", "Recife4", "PE", "23445566", "234443332", "b@gmail.com");
		
		healthWatcher.insert(u1);
		healthWatcher.insert(u2);
	}
}
