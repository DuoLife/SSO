/**
* <p>Title: User.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2015-3-9
* @version 1.0
*/
package com.dayaoyao.sso.server.dao.po;

/**
 * <p>Title: User.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2015-3-9
 * Email: vip6ming@126.com
 */
public class User {
	private int id;
	private String name;
	private String username;
	private String email;
	private String password;
	private String token;
	private String ip;
	private int age;
	
	public User() {
		super();
	}
	public User(int id, String name, String username, String email,
			String password, String token, String ip, int age) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.token = token;
		this.ip = ip;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", email=" + email + ", id=" + id + ", ip="
				+ ip + ", name=" + name + ", password=" + password + ", token="
				+ token + ", username=" + username + "]";
	}
	
}
