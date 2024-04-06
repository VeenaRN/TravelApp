package coms.RestApiWithDataJpa.entities;
	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="Person_Info")
	public class Person {

		@Id
		@GeneratedValue
		@Column(name="person_Id")
		private int prnNo;
		
		@Column(name="person_name")
		private String prnName;
		
		@Column(name="person_phone")
		private String phone;
		
		public int getPrnNo() {
			return prnNo;
		}
		public void setPrnNo(int prnNo) {
			this.prnNo = prnNo;
		}
		public String getPrnName() {
			return prnName;
		}
		public void setPrnName(String prnName) {
			this.prnName = prnName;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
	}



