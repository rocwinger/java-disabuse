package cn.itape.java.disabuse;

public class Example045 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		workHard();
		System.out.println("递归花费时间：" + (System.currentTimeMillis() - start)
				/ 1000.0);
	}

	private static void workHard() {
		try {
			workHard();
		} finally {
			workHard();
		}
	}
}
