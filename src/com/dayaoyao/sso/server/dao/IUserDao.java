/**
* <p>Title: IUserDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2015-3-12
* @version 1.0
*/
package com.dayaoyao.sso.server.dao;

import java.util.Map;

import com.dayaoyao.sso.server.dao.po.User;

/**
 * <p>Title: IUserDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2015-3-12
 * Email: vip6ming@126.com
 */
public interface IUserDao {
	/**
	 * 添加用户
	 * @author xuming
	 * 
	 * @param 
	 * 
	 * @return 
	 * 
	 * @date 2015-3-12
	 */
	public Map addUser(User user);
	/**
	 * 通过用户名获取用户信息
	 * @author xuming
	 * 
	 * @param Username
	 * 
	 * @return 
	 * 
	 * @date 2015-3-12
	 */
	public User getUserByUsername(String Username);
	/**
	 * 通过邮箱获取用户信息
	 * @author xuming
	 * 
	 * @param Email
	 * 
	 * @return 
	 * 
	 * @date 2015-3-12
	 */
	public User getUserByEmail(String Email);
}
