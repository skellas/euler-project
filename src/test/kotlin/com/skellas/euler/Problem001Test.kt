package com.skellas.euler

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem001Test {

    @Test
    fun shouldReturn23ForUnder10() {
        val valueBelowTen = Problem001(0,10)
        assertEquals(23, valueBelowTen.exec())
    }

}