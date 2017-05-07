package com.imooc.dbutil;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class DBUtil {

	private DBUtil(){
		
	}
	public static SqlSession getSqlSeesion() throws IOException {
		Reader reader = Resources.getResourceAsReader("com/imooc/config/Configuration.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder()
				.build(reader);
		SqlSession sqlSession = factory.openSession();
		return sqlSession;
	}
}
