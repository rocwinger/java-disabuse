package cn.itape.java.disabuse;

import java.math.BigDecimal;

/**
 * 具体请参考 http://imu2008.blog.51cto.com/3844842/1590229
 * @author winger
 *
 */
public class Example002 {
	public static void main(String args[]) {
		System.out.println("println:( 2.00 - 1.10) = " + (2.00 - 1.10));
		System.out.printf("printf:( 2.00 - 1.10) = %.2f%n", 2.00 - 1.10);
		System.out.println("BigDecimal:( 2.00 - 1.10) ="
				+ new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}
}
