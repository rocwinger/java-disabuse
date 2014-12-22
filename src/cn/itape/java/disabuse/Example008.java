package cn.itape.java.disabuse;

public class Example008 {
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 65535); // 1
		System.out.println(true ? x : 65536); // 2
		System.out.println(true ? x : i); // 3
		System.out.println(false ? 0 : x);// 4
		System.out.println(false ? i : x);// 5
	}
}
