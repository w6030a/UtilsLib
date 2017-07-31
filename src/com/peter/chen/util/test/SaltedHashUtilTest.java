package com.peter.chen.util.test;

import org.junit.Assert;
import org.junit.Test;
import com.peter.chen.util.SaltedHashUtil;

public class SaltedHashUtilTest {

	@Test
	public void testEmptyContentMD5() throws Exception {
		String testString = "";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_MD5);
		String expected = "d41d8cd98f00b204e9800998ecf8427e";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testEmptyContentSHA1() throws Exception {
		String testString = "";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_SHA1);
		String expected = "da39a3ee5e6b4b0d3255bfef95601890afd80709";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptyContentSHA256() throws Exception {
		String testString = "";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_SHA256);
		String expected = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptyContentSHA512() throws Exception {
		String testString = "";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_SHA512);
		String expected = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptySaltMD2Hash() throws Exception {
		String testString = "test String";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_MD2);
		String expected = "3933ae54973ff02f05e262a48ccea029";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptySaltMD5Hash() throws Exception {
		String testString = "test String";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_MD5);
		String expected = "7f4e5fcf76d0d6c231ef506e57678c5b";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptySaltSHA1Hash() throws Exception {
		String testString = "test String";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_SHA1);
		String expected = "9269ca2a6a1695eff8d5acd47b57c045698e3ce1";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptySaltSHA256Hash() throws Exception {
		String testString = "test String";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_SHA256);
		String expected = "4cadbbb27360f47e3084d8b649ef4be5e320e20b11e2eae37a57f48c41b18953";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptySaltSHA384Hash() throws Exception {
		String testString = "test String";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_SHA384);
		String expected = "a0b4445dcc967c6306272b668f699996a4d391c41a7b50149e5097c5509390c68600c6e6b1e1c6fd0ee650e35611332c";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEmptySaltSHA512Hash() throws Exception {
		String testString = "test String";
		String salt = "";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_SHA512);
		String expected = "00d69635111d3b7d50a03d98a05e684d08ac9ee0c33b9151e8f5111c9443f9b3665eedbcfca7db40a0fd551125c6c148273b1b4357b10d13c712c69d6a68d153";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSingleMD5Hash() throws Exception {
		String testString = "test String";
		String salt = "HK3345678";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_MD5);
		String expected = "2abb65d6b0b961a6bdcfc79a1af5aa5c";
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testDoubleHashMD5ThenSHA256() throws Exception {
		String testString = "test String";
		String salt = "HK3345678";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_MD5, SaltedHashUtil.HASH_TYPE_SHA256);
		String expected = "397cd04d00aafdf6be9b0cf5590d99d5bbee24b8f4e0408707d945f4644fb83e";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testTripleHashMD5ThenSHA256ThenSHA512() throws Exception {
		String testString = "test String";
		String salt = "HK3345678";
		String actual = SaltedHashUtil.hash(testString, salt, SaltedHashUtil.HASH_TYPE_MD5, SaltedHashUtil.HASH_TYPE_SHA256, SaltedHashUtil.HASH_TYPE_SHA512);
		String expected = "0e6b03cf9e99bce60279187b1f36ec425c0ea97e84a48ac737f094cf4a5889876d287b058a002c55be9c994fe18927c41555698c02281d71e60fb2dceaca11ea";
		
		Assert.assertEquals(expected, actual);
	}
	
}
