package HospitalManagement.Service;

import java.util.List;

import HospitalManagement.Entities.Patient;
import HospitalManagement.Request.PatientRequest;



public interface PatientService {

	 List<Patient> listAllReceptionist();

	public Patient createPatient(PatientRequest patientrequest);
}
