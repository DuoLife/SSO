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
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dayaoyao.sso.po.RequestProperty;
import com.dayaoyao.sso.server.dao.IUserDao;
import com.dayaoyao.sso.server.dao.mybatis.impl.UserDaoImpl;
import com.dayaoyao.sso.server.dao.po.User;
import com.google.gson.Gson;

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
		String line = "";
		for(line = bf.readLine(); line != null; line = bf.readLine()) {
			sb.append(line);
		}
//		System.out.println("ok");
		Gson g = new Gson();
		RequestProperty reqp = g.fromJson(sb.toString(), RequestProperty.class);
		System.out.println(reqp);
		if(reqp.getAction_type().equals("getByUsername")) {
			String username = reqp.getUsername();
			output(response, username);
		}
		return null;
	}
	public void output(HttpServletResponse response, String param) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(response.getOutputStream(), "UTF-8");
			IUserDao dao = new UserDaoImpl();
			User u = (User) dao.getUserByUsername(param);
			Gson g = new Gson();
			String json = g.toJson(u);
			out.write(json);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
