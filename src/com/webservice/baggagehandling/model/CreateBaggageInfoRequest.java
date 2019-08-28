package com.webservice.baggagehandling.model;

import java.time.LocalDateTime;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "CreateBaggageInfoRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateBaggageInfoRequest {
	
	private String RFID_BagTag;
	private int passengerID;
	private String sourcePlace;
	private String destinationPlace;
	private String transit;
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class) private LocalDateTime departureTime;
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class) private LocalDateTime arrivalTime;
	
	
	public CreateBaggageInfoRequest() {
	
	}


	public String getRFID_BagTag() {
		return RFID_BagTag;
	}


	public void setRFID_BagTag(String rFID_BagTag) {
		RFID_BagTag = rFID_BagTag;
	}


	public int getPassengerID() {
		return passengerID;
	}


	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}


	public String getSourcePlace() {
		return sourcePlace;
	}


	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}


	public String getDestinationPlace() {
		return destinationPlace;
	}


	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}


	public String getTransit() {
		return transit;
	}


	public void setTransit(String transit) {
		this.transit = transit;
	}


	public LocalDateTime getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}


	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public static class LocalDateAdapter extends XmlAdapter<String, LocalDateTime> {
		public LocalDateAdapter() {}
		
	    public LocalDateTime unmarshal(String v) throws Exception {
	    	LocalDateTime localDate = LocalDateTime.parse(v);
	        System.out.println(String.format("Marshalling string date [%s] to [%s]", v, localDate));
			return localDate;
	    }

	    public String marshal(LocalDateTime v) throws Exception {
	        return v.toString();
	    }
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateBaggageInfoRequest [RFID_BagTag=");
		builder.append(RFID_BagTag);
		builder.append(", passengerID=");
		builder.append(passengerID);
		builder.append(", sourcePlace=");
		builder.append(sourcePlace);
		builder.append(", destinationPlace=");
		builder.append(destinationPlace);
		builder.append(", transit=");
		builder.append(transit);
		builder.append(", departureTime=");
		builder.append(departureTime);
		builder.append(", arrivalTime=");
		builder.append(arrivalTime);
		builder.append("]");
		return builder.toString();
	}	
}
