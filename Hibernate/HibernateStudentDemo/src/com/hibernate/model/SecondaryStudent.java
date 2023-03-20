package com.hibernate.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

	@Entity
	@Table(name="tempin3")
	@AttributeOverrides({
	@AttributeOverride(column = @Column(name="name_t",length=20), name = "name")})
	
	public class SecondaryStudent extends Student {

		@Column(length=20)
		private float percentage;

		public SecondaryStudent() {
			super();
		}
		public SecondaryStudent(float percentage) {
			super();
			this.percentage = percentage;
		}
		public float getPercentage() {
			return percentage;
		}
		public void setPercentage(float percentage) {
			this.percentage = percentage;
		}
		@Override
		public String toString() {
			return "SecondaryStudent [percentage=" + percentage + "]";
		}
}