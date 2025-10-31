package main;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q9
{
	Q9(Scanner sc)
	{
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		int[] example = IntStream.range(0, N + 1)
				                 .boxed()
				                 .flatMap(x -> IntStream.range(0, N + 1)
				                 .boxed()
				                 .flatMap(y -> IntStream.range(0, N + 1)
				                 .filter(z -> x + y + z == N && 10000 * x + 5000 * y + 1000 * z == Y)
				                 .mapToObj(z -> new int[]{x, y, z})))
				                 .findFirst().orElse(new int[]{-1, -1, -1});
		
		System.out.print(example[0] + " ");
		System.out.print(example[1] + " ");
		System.out.print(example[2]);
	}
}
