package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

    @Entity
    @Table(name="childjoined_temp")
    @PrimaryKeyJoinColumn(name="t_id")
	
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