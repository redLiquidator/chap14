package com.example.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Emp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpDaoTests {
	
	@Autowired
	EmpDao dao;
	
	@Test
	public void test01_getAllEmps(){
		List<Emp> list= dao.getAllEmps();
		for(Emp e:list){
			System.out.println(e.getEmpno()+","+
							   e.getEname()+","+
							   e.getJob()+","+
							   e.getHiredate()+","+
							   e.getSal()+","+
							   e.getComm()+","+
							   e.getDeptno()
							   );
		}
	}
}
