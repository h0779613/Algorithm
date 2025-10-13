package main;

import java.util.Scanner;

public class Q2 {

	Q2(Scanner sc) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(a * b % 2 != 0 ? "Odd" : "Even");
	}
}
