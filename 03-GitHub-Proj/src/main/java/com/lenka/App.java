package com.lenka;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int a = 25;
		int b = 12;
		App ap=new App();
		System.out.println("Addition :: " +ap.add(a, b));
		System.out.println("Substraction :: "+ap.sub(a, b));
	}

	public  int add(int a, int b) {
		return a + b;
	}

	public  int sub(int a, int b) {
		return a - b;
	}
}
