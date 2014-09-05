package com.yuer.stockanalyzer.test;

import org.junit.Test;


public class CommonTest {

	@Test
	public void testPackageName() {
		String packageName = this.getClass().getPackage().getName();
		System.out.println(packageName);

		String packageName2 = CommonTest.class.getPackage().getName();
		System.out.println(packageName2);
	}

}
