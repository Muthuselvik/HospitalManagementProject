package HospitalManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import HospitalManagement.Entities.Patient;
import HospitalManagement.Repository.PatientRepository;
import HospitalManagement.Request.PatientRequest;


@Service
public class PatientServiceImpl implements PatientService{

	
	PatientRepository patientRepository;


	public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}

	public List<Patient> listAllReceptionist() {
		return patientRepository.findAll();
	}

	@Override
	public Patient createPatient(PatientRequest patientRequest) {
		Patient patient =new Patient();
		patient.setPatientName(patientRequest.getPatientName());
	    patient.setGender(patientRequest.getGender());
	    patient.setAge(patientRequest.getAge());
	    patient.setDateOfBirth(patientRequest.getDateofbirth());
	    patient.setEmailId(patientRequest.getEmail_id());
	    patient.setMaritalStatus(patientRequest.getMaritalstatus());
	    patient.setContactNo(patientRequest.getContact_no());
	    patient.setAddress(patientRequest.getAddress());
		
	    patientRepository.save(patient);
		return patient;
	}
}

