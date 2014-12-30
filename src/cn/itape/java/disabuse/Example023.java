package cn.itape.java.disabuse;

import java.util.Random;

public class Example023 {

	public static void main(String[] args) {
		errorMethod();
		rightMethod();
	}

	private static void errorMethod() {
		StringBuffer word = null;
		Random rnd = new Random();
		switch (rnd.nextInt(2)) {
		case 1:
			word = new StringBuffer('P');
		case 2:
			word = new StringBuffer('G');
		default:
			word = new StringBuffer('M');
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
	}

	private static void rightMethod() {
		StringBuffer word = null;
		Random rnd = new Random();
		switch (rnd.nextInt(3)) { // error1
		case 1:
			word = new StringBuffer("P");// error2
			break;// error3
		case 2:
			word = new StringBuffer("G");// error2
			break;// error3
		default:
			word = new StringBuffer("M");// error2
			break;// error3
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
	}
}
