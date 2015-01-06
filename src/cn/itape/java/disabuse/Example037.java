package cn.itape.java.disabuse;

public class Example037 {

	static void output1() {
//		try {
			System.out.println("如果一个 catch 子句要捕获一个类型为 E 的被检查异常，"
					+ "而其相对应的 try 子句不能抛出 E 的某种子类型的异常，那么这就是一个编译期错误");
//		} catch (IOException e) {
//			System.out.println("");
//		}
	}

	static void output2() {
		try {
			// 捕获 Exception 或 Throwble 的 catch 子句是合法的，不管与其相对应的 try 子句的内 容为何
		} catch (Exception e) {
			System.out.println("This can' t  happen");
		}
	}

	interface Type1 {
		void f() throws CloneNotSupportedException;
	}

	interface Type2 {
		void f() throws InterruptedException;
	}

	interface Type3 extends Type1, Type2 {
	}

	static class Class01 implements Type3 {
		public void f() {
			System.out.println("一个方法可以抛出的被检查异常集合是它所适用的所有类型声明要抛出的被检查异常集合的交集，"
					+ "而不是合集。因此， 静态类型为 Type3 的对象上的 f 方法根本就不能抛出任何被检查异常。");
		}
	}

	public static void main(String[] args) {
		output1();
		output2();
		Type3 t3 = new Class01();
		t3.f();
	}
}
