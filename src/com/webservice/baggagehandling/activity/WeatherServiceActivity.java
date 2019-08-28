package com.webservice.baggagehandling.activity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.baggagehandling.dao.WeatherClient;

//Getting weather API using GET method
@Path("/weather")
public class WeatherServiceActivity {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getWeather() {
		String ipAddress = WeatherClient.detectIP();
		String zipcode = WeatherClient.convertIP(ipAddress);
		String weather = WeatherClient.getWeather(zipcode);
		System.out.println(weather);
		return weather;
	}

}
