package cn.itape.java.disabuse;

public class Example039 {

	public static void main(String[] args) {
		Example039 example039 = new Example039();
		System.out.println(example039.output1());
		example039.output2();
	}

	boolean output1() {
		try {
			// ...
			return true;
		} finally {
			return false;
		}
	}

	void output2() {
		try {
			System.out.println("执行try语句内容，然后exit，不正常退出");
			Runtime.getRuntime().addShutdownHook(new Thread() {
				public void run() {
					System.out.println("Goodbye world");
				}
			});
			System.exit(0);
		} finally {
			System.out.println("这里的finally没有执行，因为exit了");
		}
	}
}
