package cn.itape.java.disabuse;

public class Example048_2 extends Example048_1 {

	// @Override
	// 静态方法不能重写
	public static void func1() {
		System.out.println("parent func,class name equals"
				+ Example048_1.class.getSimpleName());
	}
}
