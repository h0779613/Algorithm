package main;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q5
{
	Q5(Scanner sc)
	{
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		long count = IntStream.range(0, A + 1)
				              .flatMap(i -> IntStream.range(0, B + 1)
				              .flatMap(j -> IntStream.range(0, C + 1)
				              .filter(k -> i * 500 + j * 100 + k * 50 == X)))
				              .count();

		System.out.print(count);
	}
}
