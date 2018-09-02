package com.jdcy.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdcy.model.dao.EmployessMapper;
import com.jdcy.model.entity.Employess;
import com.jdcy.model.service.EmployessService;

@Service
@Transactional
public class EmployessServiceImpl implements EmployessService {

	@Autowired
	private EmployessMapper employessMapper;

	@Override
	public Integer add(Employess t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Employess t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employess query(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employess> query() {
		return employessMapper.query();
	}

}
