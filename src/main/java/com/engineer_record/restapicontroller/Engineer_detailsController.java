package com.engineer_record.restapicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineer_record.entities.engineer;
import com.engineer_record.repositories.Engineer_detailsRepository;



@RestController
@RequestMapping("/Engineer")
public class Engineer_detailsController {
	
	@Autowired  
	private Engineer_detailsRepository Engineer_detailsRepo;
	
	@GetMapping
	public List<engineer> getAllEngineer_details()
	{
		List<engineer> Engineer_details=Engineer_detailsRepo.findAll();
		return Engineer_details;
	}
	
	@PostMapping
	public void saveAllEngineer_details(@RequestBody engineer Engineer_details) {
		Engineer_detailsRepo.save(Engineer_details);
		
	}

	@PutMapping
	public void updateEngineer_details(@RequestBody engineer Engineer_details)
	{
		Engineer_detailsRepo.save(Engineer_details);
	}

	@DeleteMapping("/delete/{roll_no}")
	public void delateStudents(@PathVariable long roll_no)
	{
		Engineer_detailsRepo.deleteById(roll_no);
	}


}
