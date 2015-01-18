package cn.itape.java.disabuse;

public class Example046 {

	private Example046(Object o) {//1
		System.out.println("Object");
	}

	private Example046(double[] dArray) {//2
		System.out.println("double array");
	}

//	private Example046(String str) {//3
//		System.out.println("string");
//	}

	public static void main(String[] args) {
		new Example046(null);
	}
}
