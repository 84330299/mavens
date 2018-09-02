package com.jdcy.model.dao;

import java.util.List;

import com.jdcy.model.entity.persist.Employess;

public interface EmployessDAO {

	public List<Employess> query();

	public Employess query(Integer id);

}
