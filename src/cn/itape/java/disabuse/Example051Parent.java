package cn.itape.java.disabuse;

public class Example051Parent {

	protected int x;

	Example051Parent(int x) {
		this.x = x;
		output();
	}

	protected void output() {
		System.out.println(x);
	}
}
