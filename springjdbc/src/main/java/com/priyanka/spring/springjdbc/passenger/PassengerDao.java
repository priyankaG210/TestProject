package com.priyanka.spring.springjdbc.passenger;

import java.util.List;

public interface PassengerDao {
	
	int create(Passenger passenger);
	
	int update(Passenger passenger);
	
	int delete(Passenger passenger);
	
	Passenger read(int id);
	
	List<Passenger> read(); 

}
