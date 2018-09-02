package com.jdcy.model.service;

import java.util.List;

public interface BaseService<T> {

	public Integer add(T t);

	public Integer update(T t);

	public Integer delete(Integer id);

	public T query(Integer id);

	public List<T> query();
}
