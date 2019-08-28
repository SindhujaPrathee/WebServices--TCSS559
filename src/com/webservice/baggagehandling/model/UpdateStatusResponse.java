package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateStatusResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateStatusResponse {
	
	private boolean updatedStatus;

	public UpdateStatusResponse() {

	}

	public boolean isUpdatedStatus() {
		return updatedStatus;
	}

	public void setUpdatedStatus(boolean updatedStatus) {
		this.updatedStatus = updatedStatus;
	}
	
	
	

}
