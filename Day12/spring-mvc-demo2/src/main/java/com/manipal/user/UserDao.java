package com.manipal.user;

public class UserDao {
public boolean verifyUser(String userName, String userPassword)
{
	if(userName!="admin" && userPassword!="admin123")
		return false;
	else
		return true;
	
	
}

}
