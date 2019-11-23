package org.subum.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.subum.mapper.DataMapper;
import org.subum.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DBTest {

	@Test
	public void testConnection() throws Exception {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/wine_quality?useSSL=false&serverTimezone=Asia/Seoul";

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, "root", "12345678");

	
		log.info(con);
		con.close();

	}

	@Autowired
	TimeMapper timeMapper;
	
	@Autowired
	DataMapper dataMapper;
	
	@Test
	public void testNow() {
		
		System.out.println(timeMapper.getClass().getName());
		System.out.println(timeMapper.getTime());
		
	}
	
	@Test
	public void testData() {
		
		log.info(dataMapper.getData());
	}
	
	

}
