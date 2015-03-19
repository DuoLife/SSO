import java.util.List;

import com.dayaoyao.sso.server.dao.IUserDao;
import com.dayaoyao.sso.server.dao.mybatis.impl.UserDaoImpl;
import com.dayaoyao.sso.server.dao.po.User;

/**
 * <p>Title: TestBean.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2015-3-17
 * @version 1.0
 */

/**
 * <p>Title: TestBean.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2015-3-17
 * Email: vip6ming@126.com
 */
public class TestBean {

	public static void main(String[] args) {
		IUserDao dao = new UserDaoImpl();
		User user = new User(2,"test","1yonghu","1@123.com","123123","kjbf89y812h34lk8y0-as8dfyhn123","192.1.1.1",18);
		System.out.println(user);
		dao.addUser(user);
//		String Email = "vip88888@888.com";
//		List<User> list = (List<User>) dao.getUserByEmail(Email);
//		System.out.println(list);
	}
}
