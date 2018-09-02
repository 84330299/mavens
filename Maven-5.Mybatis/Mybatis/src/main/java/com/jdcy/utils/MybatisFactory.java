package com.jdcy.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisFactory {
	private static SqlSessionFactory sqlSessionFactory;
	private static SqlSession sqlSession;

	public static SqlSessionFactory getFactory() {
		if (sqlSessionFactory == null) {
			String resource = "Mybatis.xml";
			try {
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}

	public static SqlSession openSession() {
		if (sqlSession == null) {
			sqlSession = getFactory().openSession();
		}
		return sqlSession;
	}

}
