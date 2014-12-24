package cn.itape.java.disabuse;

public class Example010 {

	public static void main(String[] args) {
		Object a = "欢迎关注微信公众号";
		Object a1 = "欢迎关注微信公众号";
		String b = "ape_it";

		// 这个在jdk1.7上可以正确编译
		// 在《java解惑》原书使用1.5版本jdk讲述这里不能正确编译
		a += b;
		a1 = a1 + b;

		System.out.println("a=" + a + ",al=" + a1);
	}
}
