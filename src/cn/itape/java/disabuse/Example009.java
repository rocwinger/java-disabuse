package cn.itape.java.disabuse;

/**
 * 复合赋值
 * 
 * @author winger
 *
 */
public class Example009 {

	public static void main(String[] args) {
		short x = 1;
		int x1 = 1;
		int i = 123456;
		x += i; //赋值1
		x1 += i;//赋值2
		System.out.println("x = " + x + ",x1 = " + x1);
	}
}
