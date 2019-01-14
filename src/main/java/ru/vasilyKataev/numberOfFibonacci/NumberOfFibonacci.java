package ru.vasilyKataev.numberOfFibonacci;

import java.math.BigInteger;

public class NumberOfFibonacci {


    public static String lookup(String n) {

        BigInteger N = new BigInteger(n);
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger iterator = new BigInteger("1");
        BigInteger iterConst = new BigInteger("1");
        BigInteger numberOfFibonacci = new BigInteger("0");

        if (N.compareTo(numberOfFibonacci) == 0) {
            return String.valueOf(0);
        } else if (N.compareTo(iterConst) == 0) {
            return String.valueOf(1);
        } else {

            while (iterator.compareTo(N) == -1) {
                numberOfFibonacci = a.add(b);
                a = b;
                b = numberOfFibonacci;
                iterator = iterator.add(iterConst);
            }
        }
        return numberOfFibonacci.toString();
    }
}
