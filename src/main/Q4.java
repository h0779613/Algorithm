package main;

import java.util.Scanner;

public class Q4
{
	Q4(Scanner sc)
	{
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
		{
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		boolean operable = true;
		while (operable)
		{
			for (int i = 0; i < N; i++)
			{
				if (A[i] % 2 == 0)
				{
					A[i] /= 2;
				}
				else
				{
					operable = false;
				}
			}
			count++;
		}
		
		System.out.print(count - 1);
	}
}
