package com.medo.demo.entity;

/**
 * 循环依赖对象B
 */
public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
