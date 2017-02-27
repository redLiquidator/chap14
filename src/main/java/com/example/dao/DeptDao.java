package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Emp;

@Component
public class DeptDao {
	static Log log=LogFactory.getLog(EmpDao.class);
	@Autowired
	DataSource dataSource;
	public List<Emp> getAllEmps(){
		log.info("############");
		log.info("getAllEmps()");
		log.info("############");
		List<Emp> list=new ArrayList<>();
		
	
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from dept");
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()){
				Emp e= new Emp();
				e.setEmpno(rs.getInt("deptno"));
				e.setEname(rs.getString("dname"));
				list.add(e);
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		}
	
	}

