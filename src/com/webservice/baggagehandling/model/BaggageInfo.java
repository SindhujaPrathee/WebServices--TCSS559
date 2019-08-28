package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "baggage")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaggageInfo {
	
	private String RFID_BagTag;
	private double BagWeight;
	private String CurrentStatus;
	private int BaggageCarousel;
	
	public BaggageInfo() {
		
	}
	
	
	public String getRFID_BagTag() {
		return RFID_BagTag;
	}
	public void setRFID_BagTag(String rFID_BagTag) {
		RFID_BagTag = rFID_BagTag;
	}
	public double getBagWeight() {
		return BagWeight;
	}
	public void setBagWeight(double bagWeight) {
		BagWeight = bagWeight;
	}
	public String getCurrentLocation() {
		return CurrentStatus;
	}
	public void setCurrentLocation(String currentStatus) {
		CurrentStatus = currentStatus;
	}
	public int getBaggageCarousel() {
		return BaggageCarousel;
	}
	public void setBaggageCarousel(int baggageCarousel) {
		BaggageCarousel = baggageCarousel;
	}
	

}
