package cn.itape.java.disabuse;

public class Example027 {

	public static void main(String[] args) {
		int i = 0;
		shift();
		while (-1 << 32 != 0) {
			i++;
		}
//		 System.out.println(i);
	}

	private static void shift() {
		int distance = 0;
		for (int val = -1; val != 0; val <<= 1) //左移32次后，var == 0
			distance++;
		System.out.println(distance);
	}
}
