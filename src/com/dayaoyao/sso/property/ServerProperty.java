package com.dayaoyao.sso.property;

import java.net.MalformedURLException;
import java.net.URL;

public class ServerProperty {

	private static String Host = "http://sso.dayaoyao.com";
	private static String Port = "80";
	private static String action = "/sso.do";
	
	public static URL getUrl() {
		try {
			return new URL(Host + ":" + Port + action);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
