/**
* <p>Title: SSOAction.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2015-3-9
* @version 1.0
*/
package com.dayaoyao.sso.server.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * <p>Title: SSOAction.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2015-3-9
 * Email: vip6ming@126.com
 */
public class SSOAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
		StringBuffer sb = new StringBuffer();
		System.out.println("server : " + request.getRequestURI());
		System.out.println(request.getParameter("name"));
		String line = "";
		for(line = bf.readLine(); line != null; line = bf.readLine()) {
			sb.append(line);
		}
		System.out.println(sb);
		System.out.println("ok");
//		String params = request.getParameter("test");
//		System.out.println(params);
		return null;
	}
}
