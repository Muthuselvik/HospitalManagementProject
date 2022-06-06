package HospitalManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import HospitalManagement.Entities.Doctor;
import HospitalManagement.Repository.DoctorRepository;


@Service
public class DoctorServiceImpl  implements DoctorService{

	DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	@Override
	public List<Doctor> listAllDoctor() {
		return doctorRepository.findAll();
	}
}

