package com.webservice.baggagehandling.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateCarouselResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateCarouselResponse {
	
	private boolean updatedCarousel;

	public UpdateCarouselResponse() {
		
	}

	public boolean isUpdatedCarousel() {
		return updatedCarousel;
	}

	public void setUpdatedCarousel(boolean updatedCarousel) {
		this.updatedCarousel = updatedCarousel;
	}
	
	
	
	

}
