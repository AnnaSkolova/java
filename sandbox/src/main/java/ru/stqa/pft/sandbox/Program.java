package ru.stqa.pft.sandbox;

public class Program {
	public static void main(String[] args) {
		hello("user");
		double len = 5;
		System.out.println("площадь кв со стороной " + len + " + " + area(len));
		double a = 2;
		double b = 3;
		System.out.println(area(a,b));
	}

	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (double l){
		return  l * l;
	}
	public static double area (double a, double b){
		return  a * b;
	}
}
