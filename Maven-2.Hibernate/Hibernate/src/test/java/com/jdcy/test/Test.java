package com.jdcy.test;

import static org.junit.Assert.*;

import com.jdcy.model.dao.EmployessDAO;
import com.jdcy.model.entity.persist.Employess;

public class Test {

	@org.junit.Test
	public void test() {
		EmployessDAO dao = new EmployessDAO();
		Employess e = dao.findById(1);
		System.out.println();
	}

}
