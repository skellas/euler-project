package com.skellas.euler

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem001Test {

    @Test
    fun shouldReturn23ForUnder10() {
        val valueBelowTen = Problem001()
        assertEquals(23, valueBelowTen.exec(0,10))
    }

    @Test
    fun shouldReturn233168ForUnder1000() {
        val valueBelowTen = Problem001()
        assertEquals(233168, valueBelowTen.exec(0,1000))
    }
}