package cn.itape.java.disabuse;

public class Example050 {

	public static void main(String[] args) {
		String s = null;
		// 当instanceof的左操作数为null时，结果为false
		System.out.println(s instanceof String);// 1

		/** 如果instanceof的两个操作数的类型都是类，则其中一个必须是另一个的子类，否则编译出错 */
		// String与Example050类型不兼容
		// System.out.println(new Example050() instanceof String);//2
		System.out.println(new Example050() instanceof Object);// 3

		/** 在转型操作中，两个操作数的类型如果都是类，则其中一个必须是另一个的子类，否则编译出错 */
		Example050 example050 = (Example050) new Object();// 4
		// String与Example050类型不兼容
		// Example050 example051 = (Example050) new String();// 5
	}
}
