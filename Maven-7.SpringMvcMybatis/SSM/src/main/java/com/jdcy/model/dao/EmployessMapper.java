package com.jdcy.model.dao;

import java.util.List;

import com.jdcy.model.entity.Employess;

public interface EmployessMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Employess record);

    int insertSelective(Employess record);

    Employess selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Employess record);

    int updateByPrimaryKey(Employess record);
    
    public List<Employess> query();
}