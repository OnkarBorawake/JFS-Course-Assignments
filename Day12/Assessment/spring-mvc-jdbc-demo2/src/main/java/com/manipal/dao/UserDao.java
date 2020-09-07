package com.manipal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.manipal.dao.helper.UserResultSetExtractor;
import com.manipal.model.User;

public class UserDao implements IUserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addUser(User user) {
		String query = "INSERT INTO athlete VALUES(?,?,?,?,?,?)";
		int status = jdbcTemplate.update(query,user.getUserName(), user.getUserGender(), user.getSelect(), user.getEmail(), user.getPhone(), user.getUserId());
		return status;		
	}

	public List<User> getAllUsers() {
		String sql = "SELECT * FROM athlete";
		List<User> userList = jdbcTemplate.query(sql, new UserResultSetExtractor());
		return userList;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
