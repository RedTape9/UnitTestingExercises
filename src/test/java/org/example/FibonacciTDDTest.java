package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTDDTest {
    @Test
    void testFibonacci() {
        assertEquals(0, FibonacciTDD.fibonacci(0));
        assertEquals(1, FibonacciTDD.fibonacci(1));
        assertEquals(1, FibonacciTDD.fibonacci(2));
        assertEquals(2, FibonacciTDD.fibonacci(3));
        assertEquals(3, FibonacciTDD.fibonacci(4));
        assertEquals(5, FibonacciTDD.fibonacci(5));
        assertEquals(8, FibonacciTDD.fibonacci(6));
        assertEquals(13, FibonacciTDD.fibonacci(7));
        assertEquals(21, FibonacciTDD.fibonacci(8));
        assertEquals(34, FibonacciTDD.fibonacci(9));
        assertEquals(55, FibonacciTDD.fibonacci(10));
        assertEquals(89, FibonacciTDD.fibonacci(11));
        assertEquals(144, FibonacciTDD.fibonacci(12));
        assertEquals(233, FibonacciTDD.fibonacci(13));
        assertEquals(377, FibonacciTDD.fibonacci(14));
        assertEquals(610, FibonacciTDD.fibonacci(15));
        assertEquals(987, FibonacciTDD.fibonacci(16));
        assertEquals(1597, FibonacciTDD.fibonacci(17));
        assertEquals(2584, FibonacciTDD.fibonacci(18));
        assertEquals(4181, FibonacciTDD.fibonacci(19));
    }
}