package main;

import java.util.Scanner;

public class Q3 {

	Q3(Scanner sc) {
		
		String s = sc.next();
		
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		
		System.out.print(count);
	}
}
