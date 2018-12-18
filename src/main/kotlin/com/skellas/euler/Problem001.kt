package com.skellas.euler

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem001() {
    fun exec(start: Int = 0, endExclusive: Int): Int {
        return IntRange(start, endExclusive-1)
                .filter { it % 3 == 0 || it % 5 == 0 }
                .sum()
    }
}