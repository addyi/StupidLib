package de.eosn.stupid.math

import org.junit.Assert.assertEquals
import org.junit.Test

class AnswerTest {

    @Test
    fun answerTimesTest() {

        assertEquals(42, answerTimes(1))
        assertEquals(84, answerTimes(2))
        assertEquals(126, answerTimes(3))
        assertEquals(168, answerTimes(4))
        assertEquals(210, answerTimes(5))
    }
}