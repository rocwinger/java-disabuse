package cn.itape.java.disabuse;

public class Example040 {
	// private Example040 e40 = new Example040();
	private static Example040 e40 = new Example040();
	private static Class internal = e40.new InternalClazz().getClass();
	// private InternalClazz clazz = (InternalClazz) internal.newInstance();
	private InternalClazz clazz = newClazz();

	private static InternalClazz newClazz() {
		try {
			return (InternalClazz) internal.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Example040() /* throws Exception */{
		// throw new Exception("这里是exception，不是error");
	}

	public void output() {
		System.out.println("a new class");
	}

	class InternalClazz {
		public InternalClazz() {
		}
	}

	public static void main(String[] args) throws Exception {
		Example040 example040 = new Example040();
		example040.output();
	}
}

// class InternalClazz {
//
// public InternalClazz() {
//
// }
// }
// private static Example040 e40 = new Example040();
// private static Class internal = e40.new InternalClazz().getClass();
// private InternalClazz clazz = (InternalClazz) internal.newInstance();
// private InternalClazz clazz = newClazz();
//
// private static InternalClazz newClazz() {
// try {
// return (InternalClazz) internal.newInstance();
// } catch (InstantiationException | IllegalAccessException e) {
// e.printStackTrace();
// } finally {
//
// }
// return null;
// }