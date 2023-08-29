package com.project.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.project.dbutil.DBUtil;

class UserServiceImplTest {
	Connection connection;
	
	@BeforeEach
	void setUp() throws Exception {
		connection = DBUtil.getConnection();

	}
	

	@Test
	void testUserServiceImpl() {
		fail("Not yet implemented");
	}

	@Test
	void testLoginValidation() {
		fail("Not yet implemented");
	}

}
