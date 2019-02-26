package de.eosn.deepthought

import org.junit.Assert.assertEquals
import org.junit.Test

class DeepThoughtTest {

    @Test
    fun isAnswerCorrect() {
        assertEquals(42, answerToTheUltimateQuestionOfLifeTheUniverseAndEverything())
    }
}