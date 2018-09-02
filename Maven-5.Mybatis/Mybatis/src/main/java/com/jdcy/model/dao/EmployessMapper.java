package com.jdcy.model.dao;

import java.util.List;
import java.util.Map;

import com.jdcy.model.entity.Employess;

public interface EmployessMapper {
	int deleteByPrimaryKey(Integer eid);

	int insert(Employess record);

	int insertSelective(Employess record);

	Employess selectByPrimaryKey(Integer eid);

	int updateByPrimaryKeySelective(Employess record);

	int updateByPrimaryKey(Employess record);

	// 获取员工以及关联的部门信息
	Employess query(Integer eid);

	List<Employess> queryByDid(Integer did);

	List<Employess> queryByPage(Map<Object, Object> pageMap);
}