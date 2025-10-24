package main;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q8
{
	Q8(Scanner sc)
	{
		int N = sc.nextInt();
		List<Integer> d = IntStream.range(0, N)
				                   .map(i -> sc.nextInt())
				                   .boxed()
				                   .collect(Collectors.toList());
		
		long count = Stream.iterate(new State(d, 0), s -> !s.list.isEmpty(), s -> {
			int max = s.list.stream().mapToInt(Integer::intValue).max().orElse(0);
			List<Integer> next = s.list.stream().filter(di -> di != max).collect(Collectors.toList());
			return new State(next, s.count + 1);
		})
		.reduce((a, b) -> b).map(State::count).orElse(0);
		
		System.out.print(count + 1);
	}
	record State(List<Integer> list, int count) {}
}
