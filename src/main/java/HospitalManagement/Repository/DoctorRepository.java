package HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import HospitalManagement.Entities.Doctor;


public interface DoctorRepository  extends JpaRepository<Doctor,Long>{
	
	
}


