package nk.dsa.recurssion;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(BigInteger n) {
        BigInteger answer = new BigInteger("0");
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
           answer= n.multiply(factorial(n.subtract(BigInteger.ONE)));

           //return n*factorial(n-1);
        }
        return answer;
    }

    public static void main(String[] args) {

        BigInteger n = new BigInteger("5");
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
