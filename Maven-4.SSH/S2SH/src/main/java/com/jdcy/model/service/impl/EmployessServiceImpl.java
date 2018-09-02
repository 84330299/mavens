package com.jdcy.model.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.jdcy.model.dao.EmployessDAO;
import com.jdcy.model.entity.persist.Employess;
import com.jdcy.model.service.EmployessService;

@Transactional
public class EmployessServiceImpl implements EmployessService {

	private EmployessDAO employessDAO;

	public void setEmployessDAO(EmployessDAO employessDAO) {
		this.employessDAO = employessDAO;
	}

	@Override
	public List<Employess> query() {
		return employessDAO.query();
	}

	@Override
	public Employess query(Integer id) {
		return employessDAO.query(id);
	}

}
