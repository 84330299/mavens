package com.jdcy.model.dao;

import com.jdcy.model.entity.Accounts;

public interface AccountsMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    Accounts selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Accounts record);

    int updateByPrimaryKey(Accounts record);
}