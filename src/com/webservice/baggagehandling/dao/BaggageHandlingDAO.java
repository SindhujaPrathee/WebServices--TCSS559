package com.webservice.baggagehandling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.webservice.baggagehandling.MySqlConnectionFactory;
import com.webservice.baggagehandling.model.AdminLoginRequest;
import com.webservice.baggagehandling.model.BaggageInfo;
import com.webservice.baggagehandling.model.BaggageList;
import com.webservice.baggagehandling.model.CreateBaggageInfoRequest;
import com.webservice.baggagehandling.model.DeleteBaggageRequest;
import com.webservice.baggagehandling.model.UpdateCarouselRequest;
import com.webservice.baggagehandling.model.UpdateStatusRequest;





public class BaggageHandlingDAO {
	
	//connects MySQL and executes query for getting baggage status of the particular baggage
	
	public static BaggageInfo getBaggageLocation(String RFID_BagTag) {
		
		BaggageInfo location =new BaggageInfo();
		try (Connection connection = MySqlConnectionFactory.getConnection()) {
			PreparedStatement statement = connection.prepareStatement("select CurrentStatus from BaggageInfo where RFID_BagTag=?");
			statement.setString(1, RFID_BagTag);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				location.setCurrentLocation(result.getString("CurrentStatus"));
			}
			System.out.println("Status: " + location.getCurrentLocation());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return location;
		
	}
	
	//connects MySQl and executes query for creating new baggage info for a passenger already exists in the database
	public static boolean addBaggage(CreateBaggageInfoRequest request) {
		
		try (Connection connection = MySqlConnectionFactory.getConnection()) {
			PreparedStatement statement = connection.prepareStatement("insert into BaggageLog values(?,?,?,?,?,?,?)");
			statement.setString(1, request.getRFID_BagTag());
			statement.setInt(2,Integer.valueOf(request.getPassengerID()));
			statement.setString(3, request.getSourcePlace());
			statement.setString(4,request.getDestinationPlace());
			statement.setString(5, request.getTransit());
			statement.setTimestamp(6, Timestamp.valueOf(request.getDepartureTime()));
			statement.setTimestamp(7, Timestamp.valueOf(request.getArrivalTime()));
			statement.execute();
			
			return (statement.getUpdateCount() > 0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false ;
	}
	
	//connects MySQL and executes query for updating status of the baggage using RFID
	public static  boolean updateStatus(UpdateStatusRequest request) {
		
		try (Connection connection = MySqlConnectionFactory.getConnection()) {
			PreparedStatement statement= connection.prepareStatement("update BaggageInfo set CurrentStatus = ? where RFID_BagTag =?");
			statement.setString(1,request.getStatus());
			statement.setString(2,request.getRFID_BagTag());
			statement.execute();
			return (statement.getUpdateCount() > 0);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	//connects MySQL and executes query for updating carousel number of the baggage using RFID
	public static  boolean updateCarousel(UpdateCarouselRequest request) {
		
		try (Connection connection = MySqlConnectionFactory.getConnection()) {
			PreparedStatement statement= connection.prepareStatement("update BaggageInfo set BaggageCarousel= ? where RFID_BagTag = ?");
			statement.setInt(1, Integer.valueOf(request.getCarouselNumber()));
			statement.setString(2,request.getRFID_BagTag());
			statement.execute();
			return (statement.getUpdateCount() > 0);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	//connects MySQL and executes query for deleting baggage info by getting RFID
	public static  boolean deleteBaggage(DeleteBaggageRequest request) {
		
		try (Connection connection = MySqlConnectionFactory.getConnection()) {
			PreparedStatement statement= connection.prepareStatement("delete from BaggageLog where RFID_BagTag= ?");
			statement.setString(1,request.getRFID_BagTag());
			statement.execute();
			return (statement.getUpdateCount() > 0);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	//connects MySQL and executes query for checking user exists by giving username and password
	public static  boolean loginRequest(AdminLoginRequest request) {
		
		try (Connection connection = MySqlConnectionFactory.getConnection()) {
			PreparedStatement statement= connection.prepareStatement("select * from AdminLogin where UserName = ? and Pass_Word = ?");
			statement.setString(1,request.getUserName());
			statement.setString(2,request.getPassWord());
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	//connects MySQL and executes query for getting baggage list for a passenger by getting passenger ID
	public static BaggageList getBaggageList(int passengerId) {

		BaggageList baggageList = new BaggageList();
		baggageList.setPassengerId(passengerId);
		List<String> rfidList = new ArrayList<>();

		try (Connection connection = MySqlConnectionFactory.getConnection()) {
			PreparedStatement statement = connection.prepareStatement("select * from BaggageLog where PassengerID = ?");
			statement.setInt(1, Integer.valueOf(passengerId));
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				String rfid = result.getString("RFID_BagTag");
				//System.out.println(String.format("Adding RFID [%s] for passenger [%s]", passengerId, rfid));
				rfidList.add(rfid);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		baggageList.setRfidList(rfidList);
		System.out.println(baggageList);
		return baggageList;
	}

}
