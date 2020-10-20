package com.priyanka.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.priyanka.spring.springjdbc.employee.dao.EmployeeDao;
import com.priyanka.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/priyanka/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
		
		/*Employee employee= new Employee();
		employee.setId(2);
		employee.setFirstName("Harsha");
		employee.setLastName("Guggilam");
		int result = dao.create(employee);
		System.out.println("Number of records inserted : "+result);*/
		
		/*Employee employee= new Employee();
		employee.setId(1);
		employee.setFirstName("Priyanka");
		employee.setLastName("Guggilam");
		int result = dao.update(employee);
		System.out.println("Number of records updated : "+result);*/
		
		/*Employee employee= new Employee();
		employee.setId(1);
		int result = dao.delete(employee);
		System.out.println("Number of records deleted : "+result);*/
		
		/*Employee employee = dao.read(111);
		System.out.println("Employee record : "+employee);*/
		
		List<Employee> result = dao.read();
		System.out.println("Employee record : "+result);
	}

}
