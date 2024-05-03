package com.springcore.ref;

public class B {
	private int y;
	private C ex;

	public C getEx() {
		return ex;
	}

	public void setEx(C ex) {
		this.ex = ex;
	}

	@Override
	public String toString() {
		return "B [y=" + y + ", ex=" + ex + "]";
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
