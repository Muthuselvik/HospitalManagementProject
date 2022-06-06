package HospitalManagement.Request;

import java.util.Date;


public class PatientRequest {
	private String patientName;
	private String gender;
	private int age;
	private Date  dateofbirth;	
	private String email_id;
	private String maritalstatus;
	private int contact_no;
	private String address;
	private String doctor_name;
	private String reason;
	private Date admit_date;
	
	
	public PatientRequest() {
		
	}


	public String getPatientName() {
		return patientName;
	}



	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Date getDateofbirth() {
		return dateofbirth;
	}



	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public String getMaritalstatus() {
		return maritalstatus;
	}



	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}



	public int getContact_no() {
		return contact_no;
	}



	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getDoctor_name() {
		return doctor_name;
	}



	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public Date getAdmit_date() {
		return admit_date;
	}



	public void setAdmit_date(Date admit_date) {
		this.admit_date = admit_date;
	}

	
	

}
