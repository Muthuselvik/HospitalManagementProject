package HospitalManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import HospitalManagement.Entities.Patient;
import HospitalManagement.Request.PatientRequest;
import HospitalManagement.Service.PatientService;


@RestController
@RequestMapping("/api/receptionist")
public class PatientController {
	
	
	@Autowired 
	PatientService service ;
	
	@PostMapping(value="/patient")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Patient> createPatient(@RequestBody PatientRequest patientrequest){
		return new ResponseEntity<>(service.createPatient(patientrequest),HttpStatus.CREATED);
		
	
	}
	
	


}