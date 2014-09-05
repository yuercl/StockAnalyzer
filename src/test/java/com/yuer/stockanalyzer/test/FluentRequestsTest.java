package com.yuer.stockanalyzer.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.junit.Test;

public class FluentRequestsTest {

	@Test
	public void testFluent() {
		try {
			String ret = Request.Get("http://www.xueqiu.com")
					.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.103 Safari/537.36")
					.connectTimeout(1000).socketTimeout(1000).execute().returnContent().asString();
			System.out.println(ret);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}