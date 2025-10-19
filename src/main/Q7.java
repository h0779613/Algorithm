package main;

import java.util.Scanner;

public class Q7
{
	Q7(Scanner sc)
	{
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int Alice = 0;
		int Bob = 0;
		for (int i = 0; i < N; i++)
		{
			int max = 0;
			for (int j = 0; j < N; j++)
			{
				if (a[j] > max)
				{
					max = a[j];
				}
			}
			boolean done = false;
			for (int j = 0; j < N; j++)
			{
				if (a[j] == max && !done)
				{
					a[j] = 0;
					done = true;
				}
			}
			if (i % 2 == 0)
			{
				Alice += max;
			}
			else
			{
				Bob += max;
			}
		}
		
		System.out.print(Alice - Bob);
	}
}
