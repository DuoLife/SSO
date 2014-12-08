package com.dayaoyao.sso.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import com.dayaoyao.sso.po.IRequestProperty;
import com.dayaoyao.sso.po.IResponseProperty;
import com.dayaoyao.sso.property.ServerProperty;

public class PostRequestImpl implements IRequestSSO{

	public IResponseProperty send(IRequestProperty reqP) {
		try {
			URL url = ServerProperty.getUrl();
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setDoInput(true);
			con.setDoOutput(true);
			//将请求参数转换为json格式，并写入到输出流中。
			String json = "";
			setOutStream(con, json);
			//获得输入流中的对象，应该将其转化为json（之后转化为对象）
			StringBuffer sb = getInputStream(con);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//获得输入流中的对象，应该将其转化为json（之后转化为对象）
	private StringBuffer getInputStream(HttpURLConnection con) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
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
		OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
		out.write(json);
		out.flush();
		out.close();
	}
}
