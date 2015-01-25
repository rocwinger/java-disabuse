package cn.itape.java.disabuse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 使用一行代码完成以下每个方法的注释中的任务
 * 
 * @author winger
 *
 */
public class Example60 {

	/**
	 * 编写一个方法，它接受一个包含元素的 List，并返回一个新的 List，
	 * 它以相同的顺序包含相同的元素，只不过它把第二次以及后续出现的重复元素都剔除了 。 例如，如果你传递了一个包 含”
	 * spam”,”sausage”,” spam”,” spam”,” bacon”, ” spam”,” tomato” 和” spam” 的列表，
	 * 那么你将得到一个包 含” spam”,” sausage”,” bacon”,”tomato” 的新列表。
	 * */
	public static <T> List<T> withoutDuplicates(List<T> org) {
		// 使用linkedhashset可以保证相同的顺序且不出现重复元素
		return new ArrayList<T>(new LinkedHashSet<>(org));
	}

	/***
	 * 编写一个方法，它接受一个由 0 个或多个由逗号分隔的标志所组成的 字符串 ，并返回一个表示这些标志的字符串数组，
	 * 数组中的元素的顺序与这些标志在输入字符串 中出现的顺序相同。 每一个逗号后面都可能会跟随 0
	 * 个或多个空格字符，这个方法忽略它们(返回的字符串数组元素可能会有空格)。
	 * <p>
	 * 注意，不能使用StringTokenizer,因为它会以空格进行分隔
	 */
	public static String[] split(String org) {
		return org.split(",\\S*");// 以逗号分隔，非空白字符/空格
	}

	/**
	 * 假设你有一个多维数组， 出于调试的目的，你想打印它。你不知道这个数组有多少级，以及在数组的每一级中所存储的对象的类型。 编写一个
	 * 方法，它可以向你显示出在每一级上的所有元素。
	 */
	public static void printArray(Object[] obj) {
		// Arrays.deepToString。如果你传递给它一个对象引 用的数组，它将返回一个精密的字符串 表示。
		// 它可以处理嵌套数组， 甚至可以处理循环引 用，即一个数组元素直接或间接地引 用了其嵌套外层的数组。
		// 事实上， 5.0 版本中的 Arrays 类提供了一整套的 toString、equals 和 hashCode方法，
		// 使你能够打印、比较或散列任何原始类型数组或对象引用数组的内 容。
		System.out.println(Arrays.deepToString(obj));
	}

	/**
	 * 编写一个方法，它接受两个 int 数值，并在第一个数值与第二个数值 以二进制补码形式进行比较，具有更多的位被置位时，返回 true。
	 */
	public static boolean compareComplement(int i, int j) {
		// 整数类型的包装器类（Integer、 Long、 Short、 Byte 和 Char） 现在支持通用的位处理操作，
		// 包括highestOneBit、lowestOneBit、numberOfLeadingZeros、numberOfTrailingZeros、
		// bitCount、rotateLeft、rotateRight、reverse、signum 和 reverseBytes。
		return Integer.bitCount(i) > Integer.bitCount(j);
	}
}
