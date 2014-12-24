package cn.itape.java.disabuse;

public class Example011 {

	public static void main(String[] args) {
		// 执行计算,使用的是println(int)
		System.out.println('h' + 'a');
		// 字符串连接,使用的是println(String)
		System.out.println("" + 'h' + 'a');
		// 字符串连接,使用的是println(String)
		System.out.println("" + 2 + 2);
		char[] m = { '1', '2', '3' };
		// 直接输出m的类型，这里使用的是println(String)
		System.out.println("char[]= " + m);
		// 使用的是println(char[])方法，所以输出的是数组元素
		System.out.println(m);
		// 首先将字符数组转化为字符串，再输出，输出的还是数组元素,使用的是println(String)
		System.out.println(String.valueOf(m));
	}
}
