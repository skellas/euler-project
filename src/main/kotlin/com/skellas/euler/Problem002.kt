package com.skellas.euler

fun main() {
   println( Problem002().exec() )
}
class Problem002 {
    fun exec(): Int {
        val sequence: MutableList<Int> = mutableListOf(0)
        var it: Int = 1
        while (it < 4000000) {
            sequence.add(it)
            it = sequence.get(sequence.size - 1) + sequence.get(sequence.size - 2)
        }
        return sequence.filter { it % 2 == 0 }.sum()
    }
}