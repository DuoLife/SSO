/**
* <p>Title: MybatisSession.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2015-3-17
* @version 1.0
*/
package com.dayaoyao.sso.server.dao.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * <p>Title: MybatisSession.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2015-3-17
 * Email: vip6ming@126.com
 */
public class MybatisSessionInstance {

	private static String resource = "configuration.xml";
	private static SqlSessionFactory sf = null;
	
	public static SqlSession getInstance() {
		if (sf == null) {
			synchronized (SqlSessionFactory.class) {
				if (sf == null) {
					try {
						Reader reader = Resources.getResourceAsReader(resource);
						sf = new SqlSessionFactoryBuilder().build(reader);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}
		}
		return sf.openSession();
	}
}
