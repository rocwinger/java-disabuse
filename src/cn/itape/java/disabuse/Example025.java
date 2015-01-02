package cn.itape.java.disabuse;

/**
 * 【java解惑】前缀自增自减和后缀自增自减问题
 * <p>
 * http://imu2008.blog.51cto.com/3844842/1598308
 */
public class Example025 {

	public static void main(String[] args) {
		int ape = 100;
		int it = 100;
		int ape_it = 100;
		for (int i = 0; i < 100; i++) {
			ape--;
			it = it--;
			ape_it = --ape_it;
		}
		
		System.out.println("ape = " + ape);
		System.out.println("it = " + it); // error
		System.out.println("ape_it = " + ape_it);
	}
}
