package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

	@Autowired
	private JdbcTemplate jdbcTemplatge;
	
	public Map<String, Object>findById(String id){
		
		String query = "SELECT * FROM employee WHERE id = ?";
		
		Map<String, Object>employee = jdbcTemplatge.queryForMap(query, id);
		
		return employee;
	}
}
