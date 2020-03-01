package exercises;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class ExerciseLoops {

    /**
     * return the maximum of a and b
     *
     * (use an if statement, not any builtin functions)
     */
    static int max(int a, int b) {
        throw new NotImplementedException();
    }

    /**
     * Return the number n as a string, but ...
     *
     * - if the number is divisble by 3, return "fizz" instead
     * - if the number is divisble by 5, return "buzz" instead
     * - if the number is divisble by 3 and 5, return "fizzbuzz" instead
     */
    static String fizzbuzz(int n) {
        throw new NotImplementedException();
    }

    /**
     * Add up the numbers a, a+1, a+2, ..., b-1, b
     *
     * Example: summationWhile(3,6) = 3+4+5+6 = 18
     *
     * Use a while loop
     * return 0 if a > b
     */
    static int summationWhile(int a, int b) {
        throw new NotImplementedException();
    }

    /**
     * Add up the numbers a, a+1, a+2, ..., b-1, b
     *
     * Example: summationFor(3,6) = 3+4+5+6 = 18
     *
     * Use a for loop
     * return 0 if a > b
     */
    static int summationFor(int a, int b) {
        throw new NotImplementedException();
    }

    /**
     * Return true if c is a vowel (a,e,i,o,u), false otherwise
     */
    static boolean isVowel(char c) {
        throw new NotImplementedException();
    }

    /**
     * return the number of vowels in string s
     */
    static int countVowels(String s) {
        throw new NotImplementedException();
    }

    /**
     * Test, if s is a palindrome:
     *
     * palindrome('otto') -> True
     * palindrome('anna') -> True
     * palindrome('abcba') -> True
     * palindrome('a') -> True
     * palindrome('') -> True
     *
     * palindrome('peter') -> False
     * palindrome('abcbb') -> False
     */
    static boolean palindrome(String s) {
        throw new NotImplementedException();
    }

    /**
     * Implement the following algorithm:
     * Start with number n.
     *
     * If the number is even, divide it by 2
     * If the number is odd, multiply by 3 and add 1
     * Repeat until you reach 1.
     * To keep track of the numbers you produce, create an empty list, and append
     * each new number to the list, including the first number n, and the last number 1
     * The function returns the resulting list of numbers
     *
     */
    static List<Integer> threeNPlusOne(int n) {
        throw new NotImplementedException();
    }
}
