package com.priyanka.spring.springjdbc.passenger;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger pass=new Passenger();
		pass.setId(rs.getInt(1));
		pass.setFirstName(rs.getNString(2));
		pass.setLastName(rs.getString(3));
		return pass;
	}

	

}
