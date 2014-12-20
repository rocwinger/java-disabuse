package cn.itape.java.disabuse;

public class Example005 {
	public static void main(String[] args) {
		System.out.println("out1="
				+ Long.toHexString(0x100000000L + 0xcafebabe));
		System.out.println("out2="
				+ Long.toHexString(0x100000000L + 0xcafebabeL));
	}
}
