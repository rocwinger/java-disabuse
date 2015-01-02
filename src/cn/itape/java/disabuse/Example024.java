package cn.itape.java.disabuse;

public class Example024 {

	public static void main(String[] args) {
		//println只有int做为参数的重载函数，没有byte作为参数的重载函数
		//所以，以下所有的输出都使用println(int)
		System.out.println((byte) 0x90);//byte扩宽原始类型，将符号位扩宽 
		System.out.println(((byte) 0x90 & 0xff));//消除符号位
		System.out.println(0x90);//int
	}
}
