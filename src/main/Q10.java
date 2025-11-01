package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Q10
{
	Q10(Scanner sc)
	{
		String S = new StringBuilder(sc.next()).reverse().toString();
		List<String> words = Arrays.asList("maerd", "remaerd", "esare", "resare");
		
		boolean match =
		Stream.iterate(new State(0, true), s -> s.i < S.length(), s -> {
			if (!s.bool) return new State(S.length(), false);
			Optional<String> opt = words.stream().filter(word -> S.startsWith(word, s.i)).findFirst();
			return opt.isPresent()
			? new State(s.i + opt.get().length(), true)
			: new State(s.i, false);
		})
		.reduce((a, b) -> b).get().bool;
		
		System.out.print(match ? "YES" : "NO");
	}
	
	record State(int i, boolean bool) {}
}
