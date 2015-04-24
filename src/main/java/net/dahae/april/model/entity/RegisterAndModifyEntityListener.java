package net.dahae.april.model.entity;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class RegisterAndModifyEntityListener {

	@PrePersist
	public void prePersist(RegisterAndModifyEntity registerAndModifyEntity) {
		Date currentDate = getCurrentDate();
		
		registerAndModifyEntity.setRdate(currentDate);
		registerAndModifyEntity.setMdate(currentDate);
	}
	
	@PreUpdate
	public void preUpdate(RegisterAndModifyEntity registerAndModifyEntity) {
		Date currentDate = getCurrentDate();
		
		registerAndModifyEntity.setMdate(currentDate);
	}
	
	private Date getCurrentDate() {
		return new Date();
	}
}
