package cn.itape.java.disabuse;

import java.io.UnsupportedEncodingException;

public class Example018 {

	public static void main(String[] args) {
		byte bs[] = new byte[256];
		for (int i = 0; i < 256; i++) {
			bs[i] = (byte) i;
		}
		string(bs);// 调用1
		string(bs, "iso-8859-1");// 调用2
		string(bs, "gbk");// 调用3
		string(bs, "utf-8");// 调用4
	}

	static void string(byte[] bs) {
		String str = new String(bs); // 使用String(byte[])构造函数
		for (int i = 0, length = bs.length; i < length; i++) {
			System.out.print((int) str.charAt(i) + " ");
		}
	}

	static void string(byte[] bs, String charset) {
		try {
			String str = new String(bs, charset);// 使用String(byte[],charset)构造函数
			for (int i = 0, length = bs.length; i < length; i++) {
				System.out.print((int) str.charAt(i) + " ");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
