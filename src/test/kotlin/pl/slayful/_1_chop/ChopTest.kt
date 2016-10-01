package pl.slayful._1_chop

import org.junit.Test
import kotlin.test.assertEquals


class ChopTest {

    private var chop: Chop = Chop()

    @Test fun testOk() {
        assertEquals(-1, chop.chop(3, intArrayOf()))
        assertEquals(-1, chop.chop(3, intArrayOf(1)))
        assertEquals(0, chop.chop(1, intArrayOf(1)))
        assertEquals(0, chop.chop(1, intArrayOf(1, 3, 5)))
        assertEquals(1, chop.chop(3, intArrayOf(1, 3, 5)))
        assertEquals(2, chop.chop(5, intArrayOf(1, 3, 5)))
        assertEquals(-1, chop.chop(0, intArrayOf(1, 3, 5)))
        assertEquals(-1, chop.chop(2, intArrayOf(1, 3, 5)))
        assertEquals(-1, chop.chop(4, intArrayOf(1, 3, 5)))
        assertEquals(-1, chop.chop(6, intArrayOf(1, 3, 5)))
        assertEquals(0, chop.chop(1, intArrayOf(1, 3, 5, 7)))
        assertEquals(1, chop.chop(3, intArrayOf(1, 3, 5, 7)))
        assertEquals(2, chop.chop(5, intArrayOf(1, 3, 5, 7)))
        assertEquals(3, chop.chop(7, intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop.chop(0, intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop.chop(2, intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop.chop(4, intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop.chop(6, intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop.chop(8, intArrayOf(1, 3, 5, 7)))
    }

}