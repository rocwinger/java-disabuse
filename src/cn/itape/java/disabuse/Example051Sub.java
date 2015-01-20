package cn.itape.java.disabuse;

public class Example051Sub extends Example051Parent {
	String f;

	Example051Sub(int x, String f) {
		super(x);
		this.f = f;
	}

	@Override
	protected void output() {
		System.out.println(x + "--" + f);
	}

	public static void main(String[] args) {
		new Example051Sub(1, "ape_it");
	}
}
