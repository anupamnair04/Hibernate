package com.hibernate.model;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity   
@Table(name="psin3")  
@AttributeOverrides({
@AttributeOverride(column = @Column(name="name_p",length=20), name = "name")})
	
public class PrimaryStudent extends Student {
	
		@Column(length=10)
		private String grade;

		public PrimaryStudent() {
			super();
		}	
		public PrimaryStudent(String grade) {
			super();
			this.grade = grade;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		@Override
		public String toString() {
			return "PrimaryStudent [grade=" + grade + "]";
		}	
}