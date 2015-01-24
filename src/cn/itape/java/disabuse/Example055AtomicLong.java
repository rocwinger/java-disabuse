package cn.itape.java.disabuse;

import java.util.concurrent.atomic.AtomicLong;

public class Example055AtomicLong {

	private static AtomicLong numCreated = new AtomicLong();

	public Example055AtomicLong() {
		numCreated.incrementAndGet();
	}

	public synchronized static long numCreated() {
		return numCreated.get();
	}

	public static void main(String[] args) {

		/*
		 * for(int i=0;i<10;i++) Example055 e55 = new Example055();
		 * System.out.println(Example055.numCreated());
		 */

		/** 方法1：将声明放入语句块 */
		for (int i = 0; i < 10; i++) {
			Example055AtomicLong e55 = new Example055AtomicLong();
		}
		System.out.println(Example055AtomicLong.numCreated());

		/** 方法2：取消声明，直接创建实例 */
		for (int i = 0; i < 10; i++)
			new Example055AtomicLong();

		System.out.println(Example055AtomicLong.numCreated());
	}
}
