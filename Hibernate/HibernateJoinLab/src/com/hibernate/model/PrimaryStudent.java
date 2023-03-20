package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
   
@Entity
@Table(name="childjoined_pstudent")
@PrimaryKeyJoinColumn(name="p_id")	
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