package cn.itape.java.disabuse;

public class Example026 {

	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;

	public static void main(String[] args) {
		int count = 0;
		int i = START;
		do {
			count++;
		} while (i != END);
		System.out.println(count);

		count = 0;
		for (i = START; i <= END; i++) {
			count++;
			System.out.println(count);
		}
		System.out.println(count);
	}
}
