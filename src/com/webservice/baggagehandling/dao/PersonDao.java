package com.webservice.baggagehandling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.webservice.baggagehandling.MySqlConnectionFactory;

public class PersonDao {
	
	public static String getPhoneNumberByBagTag(String bagTag) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Connection connection = MySqlConnectionFactory.getConnection();
			ps = connection.prepareStatement(
					 "SELECT MobileNum, RFID_BagTag FROM BaggageLog as bl"
						+ " INNER JOIN PassengerInfo as pi ON"
						+ " bl.PassengerID = pi.PassengerID"
						+ " WHERE RFID_BagTag = '"+bagTag+"'");
			rs = ps.executeQuery();
			if (rs.next()) {
				Long mobileNumber = rs.getLong("MobileNum");
				if (mobileNumber != null) {
					return mobileNumber.toString();
				}
			}
		} catch (SQLException e) {
			System.out.println("Error fetching from database for bagTag: "+bagTag);
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				System.out.println("Error while closing connection");
				e.printStackTrace();
			}
		}
		System.out.println("Phone number for "+ bagTag +" is not present or can't fetch from database");
		return null;
	}
}
