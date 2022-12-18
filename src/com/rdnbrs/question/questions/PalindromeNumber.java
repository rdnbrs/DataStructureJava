package com.rdnbrs.question.questions;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(11));
    }


    public static boolean isPalindrome(int x) {
        if (x < 10)
            return false;

        //char array solution
        char[] charList = String.valueOf(x).toCharArray();
        for (int i = 0; i < charList.length / 2; i++) {
            if (charList[i] != charList[charList.length - 1 - i])
                return false;
        }

        return true;

        //integer solution
        /*int reverseX = 0;
        while (x > reverseX) {
            reverseX = reverseX * 10 + x % 10;
            x /= 10;
        }

        return x == reverseX || x == reverseX / 10;*/
    }
}
