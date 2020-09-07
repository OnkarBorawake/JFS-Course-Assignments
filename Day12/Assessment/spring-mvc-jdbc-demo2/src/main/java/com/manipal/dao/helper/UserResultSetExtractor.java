package com.manipal.dao.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.model.User;

public class UserResultSetExtractor implements ResultSetExtractor<List<User>> {

	public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<User> userList = new ArrayList<>();
		while(rs.next()) {
			User user = new User();
//			user.setUserId(rs.getInt(1));
			user.setUserName(rs.getString(1));
			user.setUserGender(rs.getString(2));
			user.setSelect(rs.getString(3));
			user.setEmail(rs.getString(4));
			user.setPhone(rs.getString(5));
			user.setUserId(rs.getInt(6));
			userList.add(user);
			}
		
		return userList;
	}

}
