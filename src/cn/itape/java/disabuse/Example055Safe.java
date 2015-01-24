package cn.itape.java.disabuse;

public class Example055Safe {

	private static long numCreated = 0;

	public Example055Safe() {
		synchronized (Example055Safe.class) {
			numCreated++;
		}
	}

	public synchronized static long numCreated() {
		return numCreated;
	}
	
	public static void main(String[] args) {

		/*
		 * for(int i=0;i<10;i++) Example055 e55 = new Example055();
		 * System.out.println(Example055.numCreated());
		 */

		/** 方法1：将声明放入语句块 */
		for (int i = 0; i < 10; i++) {
			Example055Safe e55 = new Example055Safe();
		}
		System.out.println(Example055Safe.numCreated());

		/** 方法2：取消声明，直接创建实例 */
		for (int i = 0; i < 10; i++)
			new Example055Safe();

		System.out.println(Example055Safe.numCreated());
	}
}
