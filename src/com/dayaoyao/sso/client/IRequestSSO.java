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

import com.dayaoyao.sso.po.IRequestProperty;
import com.dayaoyao.sso.po.IResponseProperty;

/**
 * <p>Title: IRequestSSO.java</p>
 * <p>Description: 请求单点登录服务器验证用户信息的基类。</p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: xuming</p>
 * @author xuming
 * @date 2014-12-8
 * Email: vip6ming@126.com
 */
public interface IRequestSSO {

	/**
	 * 
	 * @author xuming
	 * 
	 * @param IRequestProperty 接口的实例对象。统一参数，防止遗漏与请求信息错误。
	 * 
	 * @return IResponseProperty 接口的实例对象。方便返回信息的统一管理与获取。
	 * 
	 * @date 2014-12-8
	 */
	public IResponseProperty send(IRequestProperty reqP);
	
}
