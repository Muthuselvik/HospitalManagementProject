package HospitalManagement.Entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor
{
	@Id
		private long doctor_id;
		private String doctor_name;
		private String gender;
		private String qualification;
		private String specialist;
		private Date  dateofbirth;	
		private  Date join_date;
		private String current_address;
		private String native_address;
		
		
		public long getDoctor_id() {
			return doctor_id;
		}
		public void setDoctor_id(long doctor_id) {
			this.doctor_id = doctor_id;
		}
		public String getDoctor_name() {
			return doctor_name;
		}
		public void setDoctor_name(String doctor_name) {
			this.doctor_name = doctor_name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getSpecialist() {
			return specialist;
		}
		public void setSpecialist(String specialist) {
			this.specialist = specialist;
		}
		public Date getDateofbirth() {
			return dateofbirth;
		}
		public void setDateofbirth(Date dateofbirth) {
			this.dateofbirth = dateofbirth;
		}
		public Date getJoin_date() {
			return join_date;
		}
		public void setJoin_date(Date join_date) {
			this.join_date = join_date;
		}
		public String getCurrent_address() {
			return current_address;
		}
		public void setCurrent_address(String current_address) {
			this.current_address = current_address;
		}
		public String getNative_address() {
			return native_address;
		}
		public void setNative_address(String native_address) {
			this.native_address = native_address;
		}
		public Doctor(long doctor_id, String doctor_name, String gender, String qualification, String specialist,
				Date dateofbirth, Date join_date, String current_address, String native_address) {
			super();
			this.doctor_id = doctor_id;
			this.doctor_name = doctor_name;
			this.gender = gender;
			this.qualification = qualification;
			this.specialist = specialist;
			this.dateofbirth = dateofbirth;
			this.join_date = join_date;
			this.current_address = current_address;
			this.native_address = native_address;
		}
		@Override
		public String toString() {
			return "Doctor [doctor_id=" + doctor_id + ", doctor_name=" + doctor_name + ", gender=" + gender
					+ ", qualification=" + qualification + ", specialist=" + specialist + ", dateofbirth=" + dateofbirth
					+ ", join_date=" + join_date + ", current_address=" + current_address + ", native_address="
					+ native_address + "]";
		}
		public Doctor() {
			super();
			
		}
		
		
}
		