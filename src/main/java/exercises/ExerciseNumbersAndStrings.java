package exercises;


public class ExerciseNumbersAndStrings {
    /**
     * Adds a and b and returns the result
     */
    static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    /**
     * returns a number, where the digits of a and b are concatenated
     * Example: a = 123 (number)   b =  456 (number)
     * Result:  123456 (as a number)
     */
    static int concatDigits(int a, int b) {
        throw new RuntimeException("not implemented");
    }

    /**
     * returns the number of digits of the number n
     * <p>
     * countDigits(0) -> 1
     * countDigits(123) -> 3
     */
    static int countDigits(int a) {
        throw new RuntimeException("not implemented");
    }

    /**
     * calculates the distance between (x1, y1) und (x2, y2)
     */
    static double distance(double x1, double y1, double x2, double y2) {
        throw new RuntimeException("not implemented");
    }

    /**
     * rounds the float number x
     * <p>
     * round already exists - but as an exercise,
     * implement my_round without using round
     */
    static float myRound(float x) {
        throw new RuntimeException("not implemented");
    }

    /**
     * rounds the double number x
     * <p>
     * round already exists - but as an exercise,
     * implement my_round without using round
     */
    static double myRound(double x) {
        throw new RuntimeException("not implemented");
    }

    /**
     * return true if n is divisible by d
     * return false otherwise
     */
    static boolean isDivsible(int n, int d) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Return the greatest common divisor of a and b
     * Hint: Google for Euklidian algorithm
     */
    static int gcd(int a, int b) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Convert degrees to radians ("Grad in Bodenmaß")
     */
    static double radians(double radians) {
        throw new RuntimeException("not implemented");
    }

    /**
     * checks if the distance between the
     * float numbers a and b is smaller than epsilon
     */
    static boolean closeEnough(double a, double b, double epsilon) {
        throw new RuntimeException("not implemented");
    }

    /**
     * returns the binary representation of n
     * <p>
     * binary(3) returns "11"
     * binary(16) returns "10000"
     * binary(15) returns "1111"
     */
    static String binary(int n) {
        throw new RuntimeException("not implemented");
    }

    /**
     * throw a dice (return a random number from 1 to 6)
     * hint: look at Math.random or java.util.Random
     */
    static int dice() {
        throw new RuntimeException("not implemented");
    }
}