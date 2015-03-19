package com.dayaoyao.sso.po;

import java.util.Date;

/**
 * <p>Title: IRequestProperty.java</p>
 * <p>Description: 请求的参数对象必须是此接口的实例。</p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: xuming</p>
 * @author xuming
 * @date 2014-12-8
 * Email: vip6ming@126.com
 */
public class RequestProperty {

	private String username;
	private String email;
	private String password;
	private Date date;
	private String action_type;
	private static final String[]  action_types= {
		"getByUsername", "getByEamil"};
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAction_type() {
		return action_type;
	}
	public void setAction_type(String actionType) {
		action_type = actionType;
	}
	
	public RequestProperty() {
		super();
	}
	public RequestProperty(String username, String email, String password,
			Date date, String actionType) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.date = date;
		action_type = actionType;
	}
	public String toString() {
		return "RequestProperty [action_type=" + action_type + ", date=" + date
				+ ", email=" + email + ", password=" + password + ", username="
				+ username + "]";
	}
}
