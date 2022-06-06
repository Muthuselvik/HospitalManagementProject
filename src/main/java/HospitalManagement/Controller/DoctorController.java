package HospitalManagement.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HospitalManagement.Entities.Doctor;
import HospitalManagement.Service.DoctorService;



@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	DoctorService doctorService;

	public DoctorController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	@GetMapping
	public  List<Doctor> listAllDoctor() {
		
		return doctorService.listAllDoctor();
		
	}
	@GetMapping("/id")
	public  Doctor  getDoctorById() {
	return null;
		
	}


	@PostMapping
	
	@DeleteMapping
	public String deleteDoctor() {
		return null;
		
	}
	
	@PutMapping
	public Doctor updateDoctor() {
		return null;
		
	}

}