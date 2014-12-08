/**
* <p>Title: IRequestSSO.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-12-8
* @version 1.0
*/
package com.dayaoyao.sso.client;

/**
 * <p>Title: IRequestSSO.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-12-8
 * Email: vip6ming@126.com
 */
public interface IRequestSSO {

	/**
	 * 
	 * @author xuming
	 * 
	 * @param 参数也应为限定的对象。防止参数设定的不统一。
	 * 
	 * @return 返回对象待定，应该为是一个容器类。方便获取登录后信息。
	 * 
	 * @date 2014-12-8
	 */
	public String send();
}
