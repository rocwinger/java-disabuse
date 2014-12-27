package cn.itape.java.disabuse;

public class Example014 {

	public static void main(String[] args) {
		/**
		 * it is a test for \utest.
		 */
		// \u0022 是双引 号的 Unicode 转义字符
		System.out.println("a\u0022.length() + \u0022b".length());
		System.out.println("a".length() + "b".length());
	}
}
