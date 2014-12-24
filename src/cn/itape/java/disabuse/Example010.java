package cn.itape.java.disabuse;

public class Example010 {

	public static void main(String[] args) {
		Object a = "欢迎关注微信公众号";
		Object a1 = "欢迎关注微信公众号";
		String b = "ape_it";

		a += b; // 赋值3 这个在jdk1.7上可以正确编译，之前版本未测试
		a1 = a1 + b;

		System.out.println("a=" + a + ",al=" + a1);
	}
}
