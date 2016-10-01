package pl.slayful._1_chop

class Chop {

    /**
     * Write a method which given an integer and an array of integers
     * returns the first position of a given integer or -1
     * Based on: http://codekata.com/kata/kata02-karate-chop/
     */
    fun chop(value: Int, array : IntArray): Int {
        for (i in array.indices) {
            if (array[i] == value) {
                return i
            }
        }
        return -1
    }
}