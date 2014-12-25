package cn.itape.java.disabuse;

public class Example013 {

	public static void main(String[] args) {
		final String pig = "length:8";
		final String pig1 = "length:8";
		int length = pig.length();
		final String dog = "length:" + pig.length();
		System.out.println("pig's length is :" + length);
		System.out.println("pig is same as dog ? " + pig == dog); // 输出1
		System.out.println(("pig is same as dog ? " + pig) == dog); // 输出1
		System.out.println("pig is same as pig1 ? " + (pig == pig1));// 输出2
		System.out.println("pig is same as dog ? " + (pig == dog));// 输出3
		System.out.println("pig is same as dog ? " + (pig.equals(dog)));// 输出4
	}
}
