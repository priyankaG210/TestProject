package com.priyanka.spring.springjdbc.passenger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int create(Passenger passenger) {
		String sql="insert into passenger values(?,?,?)";
		int result = jdbcTemplate.update(sql, passenger.getId(),passenger.getFirstName(),passenger.getLastName());
		return result;
	}

	@Override
	public int update(Passenger passenger) {
		String sql="update passenger set firstName=?,lastName=? where id=?";
		int result = jdbcTemplate.update(sql, passenger.getFirstName(),passenger.getLastName(),passenger.getId());
		return result;
	}

	@Override
	public int delete(Passenger passenger) {
		String sql="delete from passenger where id=?";
		int result = jdbcTemplate.update(sql, passenger.getId());
		return result;
	}

	@Override
	public Passenger read(int id) {
		String sql="select * from passenger where id=?";
		PassengerRowMapper rowmapper=new PassengerRowMapper();
		Passenger result = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return result;
	}

	@Override
	public List<Passenger> read() {
		String sql="select * from passenger";
		PassengerRowMapper rowmapper=new PassengerRowMapper();
		List<Passenger> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}

}
