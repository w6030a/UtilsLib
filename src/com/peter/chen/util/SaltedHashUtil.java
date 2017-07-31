package com.peter.chen.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SaltedHashUtil {

	static public final String HASH_TYPE_MD2 = "MD2";
	static public final String HASH_TYPE_MD5 = "MD5";
	static public final String HASH_TYPE_SHA1 = "SHA-1";
	static public final String HASH_TYPE_SHA256 = "SHA-256";
	static public final String HASH_TYPE_SHA384 = "SHA-384";
	static public final String HASH_TYPE_SHA512 = "SHA-512";
	
	public static String hash(String content, String salt, String... hashTypes) throws NoSuchAlgorithmException {
		String temp = salt + content;
		
		for(String hashType : hashTypes) {
			temp = hash(hashType, temp);
		}
		
		return temp;
	}
	
	private static String hash(String hashType, String base) throws NoSuchAlgorithmException {
		MessageDigest digest;
		byte[] hash = null;
		final String BYTE_ENCODING = "UTF-8";
		
		try {
			digest = MessageDigest.getInstance(hashType);
			hash = digest.digest(base.getBytes(BYTE_ENCODING));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		
		return byteToHex(hash); 
	}

	private static String byteToHex(byte[] hash) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if(hex.length() == 1) hexString.append('0');
			hexString.append(hex);
		}
		
		return hexString.toString();
	}
}
