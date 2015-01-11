package cn.itape.java.disabuse;

public class Example042 {

	public static void main(String[] args) {
		int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 }, { 1, 2, 3 },
				{ 1, 2, 3, 4 }, { 1 } };
		System.out.println("func1 out : " + func1(tests));
		System.out.println("func2 out : " + func2(tests));
		System.out.println("func3 out : " + func3(tests));
	}

	private static int func1(int[][] tests) {
		int successCount = 0;
		try {
			int i = 0;
			while (true) {
				if (thirdElementIsThree1(tests[i++])) {
					successCount++;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		return successCount;
	}

	private static int func2(int[][] tests) {
		int successCount = 0;
		try {
			for (int[] test : tests) {
				if (thirdElementIsThree1(test)) {
					successCount++;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return successCount;
	}

	private static boolean thirdElementIsThree1(int[] a) {
		return a.length >= 3 & a[2] == 3;
	}

	private static int func3(int[][] tests) {
		int successCount = 0;
		try {
			for (int[] test : tests) {
				if (thirdElementIsThree2(test)) {
					successCount++;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return successCount;
	}

	private static boolean thirdElementIsThree2(int[] a) {
		return a.length >= 3 && a[2] == 3;
	}
}
