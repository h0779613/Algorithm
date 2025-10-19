package main;

import java.util.Scanner;

public class Q6
{
	Q6(Scanner sc)
	{
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int total = 0;
		for (int i = 0; i < N; i++)
		{
			String str = String.valueOf(i + 1);
			int len = str.length();
			int sum = 0;
			for (int j = 0; j < len; j++)
			{
				sum += str.charAt(j) - '0';
			}
			if (sum >= A && sum <= B)
			{
				total += i + 1;
			}
		}
		
		System.out.print(total);
	}
}
