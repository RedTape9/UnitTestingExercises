package org.example;

public class FibonacciTDD {
    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < number; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
}