package com.jdcy.model.service;

import java.util.List;

import com.jdcy.model.entity.persist.Employess;

public interface EmployessService {
	
	public List<Employess> query();

	public Employess query(Integer id);

}
