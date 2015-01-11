package cn.itape.java.disabuse;

/**
 * http://imu2008.blog.51cto.com/3844842/1601932
 * <p>
 * 未解决问题
 */
public class Example034 {

	public static void main(String[] args) {
		int count = 0;
		int start = 2000000000;
		for (float f = start; f < start + 64; f++) {// 执行0次
			count++;
		}
		System.out.println(count);
		count = 0;
		System.out.println("将循环控制条件的值加1后……");
		for (float f = start; f < start + 65; f++) {// 死循环
			count++;
		}
		System.out.println(count);
	}
}
