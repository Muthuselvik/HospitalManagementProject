package HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import HospitalManagement.Entities.Patient;


public interface PatientRepository extends JpaRepository<Patient,Long>{

}
