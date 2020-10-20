package com.priyanka.spring.springjdbc.passenger;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.priyanka.spring.springjdbc.employee.dao.EmployeeDao;
import com.priyanka.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/priyanka/spring/springjdbc/passenger/config.xml");
		PassengerDao dao = (PassengerDao) ctx.getBean("passengerDao");
		
		/*Passenger p = new Passenger();
		p.setId(111);
		p.setFirstName("abc");
		p.setLastName("xyz");
		int result = dao.create(p);
		System.out.println("Number of records inserted : "+result);*/
		
		
		/*Passenger p = new Passenger();
		p.setId(111);
		p.setFirstName("ABC");
		p.setLastName("XYZ");
		int result = dao.update(p);
		System.out.println("Number of records updated : "+result);*/
		
		/*Passenger p = new Passenger();
		p.setId(111);
		int result = dao.delete(p);
		System.out.println("Number of records deleted : "+result);*/
		
		/*Passenger result=dao.read(111);
		System.out.println("Passenger record : "+result);*/
		
		List<Passenger> result = dao.read();
		System.out.println("Passenger record : "+result);
		}

}
