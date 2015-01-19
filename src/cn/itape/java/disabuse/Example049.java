package cn.itape.java.disabuse;

import java.util.Calendar;

public class Example049 {

	private final int overtime;
	private static final int CURRENT_YEAR = Calendar.getInstance().get(
			Calendar.YEAR);//2
	public static final Example049 INSTANCE = new Example049();//1

	private Example049() {
		overtime = CURRENT_YEAR - 1970;
	}

	public int getOverTime() {
		return overtime;
	}

	public static void main(String[] args) {
		System.out.println(INSTANCE.getOverTime());
	}
}
