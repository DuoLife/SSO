/**
* <p>Title: UserDaoImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2015-3-12
* @version 1.0
*/
package com.dayaoyao.sso.server.dao.mybatis.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dayaoyao.sso.server.dao.IUserDao;
import com.dayaoyao.sso.server.dao.mybatis.MybatisSessionInstance;
import com.dayaoyao.sso.server.dao.po.User;

/**
 * <p>Title: UserDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2015-3-12
 * Email: vip6ming@126.com
 */
public class UserDaoImpl implements IUserDao {

	private static SqlSession session = MybatisSessionInstance.getInstance();
	public Map addUser(User user) {
		int i = session.insert("User.insert", user);
		session.commit();
		return null;
	}

	public User getUserByEmail(String Email) {
		Map paramsMap = new HashMap();
		paramsMap.put("email", Email);
		List i = session.selectList("User.selectByEmail", paramsMap);
		return (User) i.get(0);
	}

	public User getUserByUsername(String Username) {
		Map paramsMap = new HashMap();
		paramsMap.put("username", Username);
		List i = session.selectList("User.selectByUsername", paramsMap);
		return (User) i.get(0);
	}

}
