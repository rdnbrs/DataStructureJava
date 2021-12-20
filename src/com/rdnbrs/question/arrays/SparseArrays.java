package com.rdnbrs.question.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SparseArrays {

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		// Write your code here
		List<Integer> result = new ArrayList<Integer>();

		/* Collection solution
		 * for(int i=0;i<queries.size();i++)
		 * result.add(Collections.frequency(strings,queries.get(i)));
		 */

		//O(n+m) solution
		HashMap<String, Integer> resultMap = new HashMap<>();
		queries.stream().forEach(item -> resultMap.put(item, 0));

		strings.stream().forEach(item -> {
			if (resultMap.containsKey(item))
				resultMap.put(item, (resultMap.get(item) + 1));
		});

		queries.stream().forEach(item -> result.add(resultMap.get(item)));
		

		return result;
	}

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("aba");
		strings.add("baba");
		strings.add("aba");
		strings.add("xzxb");

		//try to find this strings count in strings array
		List<String> queries = new ArrayList<>();
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");

		System.out.println(matchingStrings(strings, queries));
	}
}
