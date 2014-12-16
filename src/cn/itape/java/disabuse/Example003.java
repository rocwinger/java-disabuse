package cn.itape.java.disabuse;

/**
 * @author winger
 *
 */
public class Example003 {

	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MICROS_PER_DAY_L1 = 24 * 60 * 60 * 1000 * 1000L;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println("NO L Print:" + MICROS_PER_DAY / MILLIS_PER_DAY);
		System.out.println("Has L Print:" +MICROS_PER_DAY_L1 / MILLIS_PER_DAY);
	}
}
