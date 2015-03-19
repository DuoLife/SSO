package com.dayaoyao.sso.property;

import java.net.MalformedURLException;
import java.net.URL;

public class ServerProperty {

//	private static String Host = "http://sso.dayaoyao.com";
	private static String Host = "http://localhost";
	private static String Port = "2103";
	private static String action = "/SSO/sso.do";
	
	public static URL getUrl() {
		try {
			String url = Host + ":" + Port + action;
			return new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
