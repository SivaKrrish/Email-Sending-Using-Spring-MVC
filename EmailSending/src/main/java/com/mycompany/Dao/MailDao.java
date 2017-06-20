/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Dao;

import com.mycompany.Model.Mail;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author SivaKrrish
 */
@Component
public class MailDao {
    
 
	
	private DataSource dataSource;
	private JdbcTemplate jdbctemplate;

	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbctemplate = new JdbcTemplate(dataSource);
	}

	public int getMailCount()
	{
		int rowCount = 0;
		try{
		String sql = "select count(*) from Messages";
	        rowCount = jdbctemplate.queryForObject(sql, Integer.class);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return rowCount;

	}
	
	public void insert(Mail insertmail)
	{
		try{
		String insertsql = "INSERT INTO MESSAGES VALUES(?,?,?,?)";
		jdbctemplate.update(insertsql, new Object[] {
				insertmail.getFromadd(), 
				insertmail.getToadd(),
				insertmail.getSubject(), 
				insertmail.getMessage()});
		System.out.println("successfully inserted");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    
    
}

