package main;

import java.util.Scanner;
import java.util.stream.Stream;

public class Q11
{
	Q11(Scanner sc)
	{
		int N = sc.nextInt();
		int[] t = new int[N];
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++)
		{
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		boolean feasible =
		Stream.iterate(new State(0, 0, 0, 0, true), s -> s.i < N + 1, s -> {
			if (s.i == N) return new State(N + 1, 0, 0, 0, s.feasible);
			int dt = t[s.i] - s.prevT;
			int d = Math.abs(x[s.i] - s.prevX) + Math.abs(y[s.i] - s.prevY);
			boolean ok = d <= dt && (dt - d) % 2 == 0;
			return new State(s.i + 1, t[s.i], x[s.i], y[s.i], s.feasible && ok);
		})
		.reduce((a, b) -> b).get().feasible;
		
		System.out.print(feasible ? "Yes" : "No");
	}
	
	record State(int i, int prevT, int prevX, int prevY, boolean feasible) {}
}
