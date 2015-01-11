package cn.itape.java.disabuse;

public class Example038 {

	public final static String GUEST_ID = "ape_it";
	// private final static String ID;
	private final static String ID = getIDNew();

//	static {
//		try {
//			ID = getID();
//		} catch (GetIDException e) {
//			ID = GUEST_ID;
//	 		e.printStackTrace();
//		}
//	}

	private static String getIDNew() {
		try {
			return getID();
		} catch (Exception e) {
			return GUEST_ID;
		}
	}

	private static String getID() throws GetIDException {
		throw new GetIDException();
	}

	static class GetIDException extends Exception {
		private static final long serialVersionUID = 1L;
	}
}
