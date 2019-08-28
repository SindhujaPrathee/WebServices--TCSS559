package com.webservice.baggagehandling.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BaggageList {
	
	private List<String> rfidList = new ArrayList<>();
	private int passengerId;
	
	public BaggageList() {
	
	}


	public List<String> getRfidList() {
		return rfidList;
	}



	public void setRfidList(List<String> rfidList) {
		this.rfidList = rfidList;
	}



	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaggageList [rfidList=");
		builder.append(rfidList);
		builder.append(", passengerId=");
		builder.append(passengerId);
		builder.append("]");
		return builder.toString();
	}
}
