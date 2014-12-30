package cn.itape.java.disabuse;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example020 {

	public static void main(String[] args) {
		String separator = File.separator;
		String clazzName = Example020.class.getName();
		String rs1 = clazzName.replace(".", separator); // 方法1
		String rs2 = clazzName.replaceAll("\\.", "\\\\");// 方法2
		String rs3 = clazzName.replaceAll(Pattern.quote("."),
				Matcher.quoteReplacement(separator));// 方法3
		System.out.println("class name =" + clazzName);
		System.out.println("rs1=" + rs1);
		System.out.println("rs2=" + rs2);
		System.out.println("rs3=" + rs3);
	}
}
