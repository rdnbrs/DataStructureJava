package com.rdnbrs.question.stacks;

import java.util.ArrayList;

public class BalancedBrackets {

	public static boolean isBalanced(String s) {
		ArrayList<Character> controlStack = new ArrayList<>();
		char[] charList = s.toCharArray();
		for (int i = 0; i < charList.length; i++) {
			if (!controlStack.isEmpty() && ((controlStack.get(controlStack.size() - 1) == '(' && charList[i] == ')')
					|| (controlStack.get(controlStack.size() - 1) == '{' && charList[i] == '}')
					|| (controlStack.get(controlStack.size() - 1) == '[' && charList[i] == ']'))) {
				controlStack.remove(controlStack.size() - 1);
			} else {
				controlStack.add(charList[i]);
			}
		}

		return controlStack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("[[{[]}{(())}]]"));
	}

}
