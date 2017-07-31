package com.peter.chen.util.test;

import org.junit.Assert;
import org.junit.Test;
import com.peter.chen.util.Base64Util;

public class Base64UtilTest {

	@Test
	public void testEncode() {
		String testString = "test String";
		byte[] temp = Base64Util.encode(testString.getBytes());
		String actual = new String(temp);
		String expected = "dGVzdCBTdHJpbmc=";
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testDecode() {
		String testString = "dGVzdCBTdHJpbmc=";
		byte[] temp = Base64Util.decode(testString.getBytes());
		String actual = new String(temp);
		String expected = "test String";
		
		Assert.assertEquals(expected, actual);
	}
}
