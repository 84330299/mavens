package com.jdcy.model.dao;
// Generated 2017-7-15 11:33:35 by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import com.jdcy.model.entity.persist.Departments;

/**
 * Home object for domain model class Departments.
 * @see com.jdcy.model.entity.persist.Departments
 * @author Hibernate Tools
 */
public class DepartmentsDAO {

	private static final Log log = LogFactory.getLog(DepartmentsDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Departments transientInstance) {
		log.debug("persisting Departments instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Departments instance) {
		log.debug("attaching dirty Departments instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Departments instance) {
		log.debug("attaching clean Departments instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Departments persistentInstance) {
		log.debug("deleting Departments instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Departments merge(Departments detachedInstance) {
		log.debug("merging Departments instance");
		try {
			Departments result = (Departments) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Departments findById(java.lang.Integer id) {
		log.debug("getting Departments instance with id: " + id);
		try {
			Departments instance = (Departments) sessionFactory.getCurrentSession()
					.get("com.jdcy.model.entity.persist.Departments", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Departments instance) {
		log.debug("finding Departments instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.jdcy.model.entity.persist.Departments").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
