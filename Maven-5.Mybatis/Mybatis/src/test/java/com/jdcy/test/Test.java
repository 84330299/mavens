package com.jdcy.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.jdcy.model.dao.EmployessMapper;
import com.jdcy.model.entity.Departments;
import com.jdcy.model.entity.Employess;
import com.jdcy.utils.MybatisFactory;

public class Test {

	public static void main(String[] args) {
		SqlSession session = MybatisFactory.openSession();
		EmployessMapper employessMapper = session.getMapper(EmployessMapper.class);
		Employess e = new Employess();
		e.setEid(19);
		e.setEname("บวบว");
		Departments d = new Departments();
		d.setDid(2);
		e.setDepartments(d );
		int row = employessMapper.updateByPrimaryKeySelective(e );
		session.commit();
		System.out.println();
	}

}
