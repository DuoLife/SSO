package com.dayaoyao.sso.client.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import com.dayaoyao.sso.client.IRequestSSO;
import com.dayaoyao.sso.po.RequestProperty;
import com.dayaoyao.sso.po.IResponseProperty;
import com.dayaoyao.sso.property.ServerProperty;
import com.google.gson.Gson;

public class PostRequestImpl implements IRequestSSO{

	public IResponseProperty send(RequestProperty reqP) {
		try {
			URL url = ServerProperty.getUrl();
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "text/xml");
			con.setDoInput(true);
			con.setDoOutput(true);
			//将请求参数转换为json格式，并写入到输出流中。
			String json = new Gson().toJson(reqP);
			setOutStream(con, json);
			//获得输入流中的对象，应该将其转化为json（之后转化为对象）
			StringBuffer sb = getInputStream(con);
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//获得输入流中的对象，应该将其转化为json（之后转化为对象）
	private StringBuffer getInputStream(HttpURLConnection con) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
		StringBuffer sb = new StringBuffer();
		String line = br.readLine();
		while(line != null) {
			sb.append(line);
			line = br.readLine();
		}
		br.close();
		return sb;
	}
	
	//将请求参数转换为json格式，并写入到输出流中。
	private void setOutStream(HttpURLConnection con, String json) throws IOException {
		OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
		out.write(json);
		out.flush();
		out.close();
	}
	
	public static void main(String[] args) {
		PostRequestImpl req = new PostRequestImpl();
		String username = "loltest";
		String email = "1@test.com";
		String password = "123456";
		String action_type = "getByUsername";
		Date date = new Date();
		RequestProperty reqP = new RequestProperty(username, email, password, date, action_type);
		req.send(reqP);
	}
}
