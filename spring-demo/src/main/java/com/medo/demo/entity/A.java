package com.medo.demo.entity;

/**
 * 循环依赖对象A
 */
public class A {
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
