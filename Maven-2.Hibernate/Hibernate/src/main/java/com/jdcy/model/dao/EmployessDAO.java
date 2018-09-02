package com.jdcy.model.dao;
// Generated 2017-7-15 11:33:35 by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import com.jdcy.model.entity.persist.Employess;

/**
 * Home object for domain model class Employess.
 * @see com.jdcy.model.entity.persist.Employess
 * @author Hibernate Tools
 */
public class EmployessDAO {

	private static final Log log = LogFactory.getLog(EmployessDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Employess transientInstance) {
		log.debug("persisting Employess instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Employess instance) {
		log.debug("attaching dirty Employess instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Employess instance) {
		log.debug("attaching clean Employess instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Employess persistentInstance) {
		log.debug("deleting Employess instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Employess merge(Employess detachedInstance) {
		log.debug("merging Employess instance");
		try {
			Employess result = (Employess) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Employess findById(java.lang.Integer id) {
		log.debug("getting Employess instance with id: " + id);
		try {
			Employess instance = (Employess) sessionFactory.openSession()
					.get("com.jdcy.model.entity.persist.Employess", id);
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

	public List findByExample(Employess instance) {
		log.debug("finding Employess instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.jdcy.model.entity.persist.Employess")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
