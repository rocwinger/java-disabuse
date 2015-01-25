package cn.itape.java.disabuse;

public class Example059 {

	public static void main(String[] args) {
		/**以0开头的整形字面常量将被解释成八进制数值*/
		int a = 012;
		int b = 12;
		System.out.println("a=" + a + ",b=" + b);
	}
}
