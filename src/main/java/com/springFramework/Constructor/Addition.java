package com.springFramework.Constructor;

public class Addition {
	private int num1;
	private int num2;

	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("constructor : int , int ");
	}

	private Addition(double num1, double num2) {
		this.num1 = (int) num1;
		this.num2 = (int) num2;
		System.out.println("construtor : double , double");
	}

	private Addition(String num1, String num2) {
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("constructor : string , string");
	}

	public void doSum() {
		System.out.println("Number 1:" + this.num1 + ","+"Number 2:" + this.num2);
		System.out.println("Addition of num1 + num2 : " + (this.num1 + this.num2));

	}

}
