package de.eosn.stupid

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class StupidTest {

    @Test
    fun testSupportedLocal() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext

        assertEquals(appContext.resources.getString(R.string.stupid), Stupid.forLocal())
        assertEquals("stupid", Stupid.forLocal(Locale.ROOT))
        assertEquals(appContext.resources.getString(R.string.stupid), Stupid.forLocal(null))
        assertEquals("stupid", Stupid.forLocal(Locale.UK))
        assertEquals("stupid", Stupid.forLocal(Locale.ENGLISH))
        assertEquals("stupid", Stupid.forLocal(Locale.CANADA))
        assertEquals("stupid", Stupid.forLocal(Locale.US))
        assertEquals("blöd", Stupid.forLocal(Locale.GERMANY))
        assertEquals("blöd", Stupid.forLocal(Locale.GERMAN))
        assertEquals("stupido", Stupid.forLocal(Locale.ITALIAN))
        assertEquals("stupido", Stupid.forLocal(Locale.ITALY))
        assertEquals("stupide", Stupid.forLocal(Locale.FRANCE))
        assertEquals("stupide", Stupid.forLocal(Locale.FRENCH))
        assertEquals("stupide", Stupid.forLocal(Locale.CANADA_FRENCH))
        assertEquals("바보", Stupid.forLocal(Locale.KOREA))
        assertEquals("바보", Stupid.forLocal(Locale.KOREAN))
    }

    @Test
    fun testUnsupportedLocal() {

        // ATTENTION: This test is not conclusive for all locals

        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.JAPANESE))
        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.JAPAN))
        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.CHINESE))
        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.CHINA))
        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.PRC))
        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.SIMPLIFIED_CHINESE))
        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.TAIWAN))
        assertEquals(Stupid.forLocal(Locale.ROOT), Stupid.forLocal(Locale.TRADITIONAL_CHINESE))
    }

}
