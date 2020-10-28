package itis.Fayzrakhmanov;

import java.util.Scanner;

public class App {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Printer pr1 = new Printer();
		System.out.println(pr1.isOn);
		pr1.onOff();
		System.out.println(pr1.isOn);
		pr1.print("Test");
	}
}