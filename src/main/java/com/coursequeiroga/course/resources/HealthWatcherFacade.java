package com.coursequeiroga.course.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.coursequeiroga.course.entities.AnimalComplaint;
import com.coursequeiroga.course.entities.Complaint;
import com.coursequeiroga.course.entities.FoodComplaint;
import com.coursequeiroga.course.entities.OtherComplaint;
import com.coursequeiroga.course.repositories.AnimalComplaintRepositoryJDBC;
import com.coursequeiroga.course.repositories.FoodComplaintRepositoryJDBC;
import com.coursequeiroga.course.repositories.OtherComplaintRepositoryJDBC;




@RestController
@RequestMapping(value = "/complaints")
public class HealthWatcherFacade {
	@Autowired
	private AnimalComplaintRepositoryJDBC AnimalComplaintrepository;
	
	@Autowired
	private FoodComplaintRepositoryJDBC FoodComplaintrepository;
	
	@Autowired
	private OtherComplaintRepositoryJDBC OtherComplaintrepository;
	
	
	
	@PostMapping
	public ResponseEntity<Complaint> insert(@RequestBody Complaint obj) {
		
		URI uri;
		if(obj instanceof AnimalComplaint) {
			obj = AnimalComplaintrepository.save((AnimalComplaint) obj);
			uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(((AnimalComplaint) obj).getId()).toUri();
		}
		else if(obj instanceof FoodComplaint) {
			obj = FoodComplaintrepository.save((FoodComplaint) obj);
			uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(((FoodComplaint) obj).getId()).toUri();
		}else {
			obj = OtherComplaintrepository.save((OtherComplaint) obj);
		    uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(((OtherComplaint) obj).getId()).toUri();
		}
		
		return ResponseEntity.created(uri).body(obj);
	}
	

	
}
