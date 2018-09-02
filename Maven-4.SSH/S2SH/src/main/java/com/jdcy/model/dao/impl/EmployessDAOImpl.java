package com.jdcy.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jdcy.model.dao.EmployessDAO;
import com.jdcy.model.entity.persist.Employess;

public class EmployessDAOImpl implements EmployessDAO {

	private SessionFactory sessionFactory;

	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Employess> query() {
		List<Employess> elist = currentSession().createQuery("from Employess").list();
		System.out.println();
		return elist;
	}

	@Override
	public Employess query(Integer id) {
		Employess emp = (Employess) currentSession().createQuery("from Employess e where e.eid = ?").setInteger(0, id);
		return emp;
	}

}
