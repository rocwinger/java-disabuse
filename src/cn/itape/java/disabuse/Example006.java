package cn.itape.java.disabuse;

public class Example006 {

	public static void main(String[] args) {
		System.out.println("(byte) -1 = " + (byte) -1);
		System.out.println("(char) -1 = " + (char) -1); // 為什麼不輸出值呢？
		System.out.println("(char)((byte) -1) = " + (char) ((byte) -1)); // 為什麼不輸出值呢？
		System.out.println("(int)((char)((byte) -1)) = "
				+ (int) ((char) ((byte) -1)));
	}
}
