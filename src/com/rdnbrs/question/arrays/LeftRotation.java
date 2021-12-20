package com.rdnbrs.question.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		List<Integer> result = new ArrayList<>();
		int rotateCount = d % arr.size();
		for (int i = rotateCount; i < arr.size(); i++) {
			result.add(arr.get(i));
		}
		for (int i = 0; i < rotateCount; i++) {
			result.add(arr.get(i));
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> sortedList = new ArrayList<>();
		sortedList.add(1);
		sortedList.add(2);
		sortedList.add(3);
		sortedList.add(4);
		sortedList.add(5);
		sortedList.add(6);

		sortedList = rotateLeft(4, sortedList);
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.print(sortedList.get(i));
		}
	}

}
