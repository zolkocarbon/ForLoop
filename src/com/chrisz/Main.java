package com.chrisz;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calcualteInterest(10000, 2));

       // for(init; termination; increment) {
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calcualteInterest(10000, i)));
        }
        for(int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calcualteInterest(10000, i)));
        }


        // ********* Challenge 1
        int count = 0;
        for(int i=10; i<1000; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
                if(count == 3) {
                    break;
                }
            }

        }

        // ********** Challenge 2
        System.out.println("********** Challenge 2 *********");

        int sum = 0;
        int secondCount = 0;
        for(int i=1; i<=1000; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                sum += i;
                secondCount++;
                System.out.println("Match " + secondCount + " is " + i);
                if(secondCount == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of the first five matches is " + sum);

        // *********** Challenge 3
        System.out.println("********** Challenge 3 *********");
        System.out.println(sumOdd(100,1000));

    }

    public static double calcualteInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    // ************* Challenge
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // *********** Challenge 3
    public static boolean isOdd(int number) {
        if(number > 0 && number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if(end < start || start <=0 || end <= 0) {
            return -1;
        }

        int sum = 0;
        for(int i=start; i<= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
