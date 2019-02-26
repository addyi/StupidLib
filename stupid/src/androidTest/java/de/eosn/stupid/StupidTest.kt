package de.eosn.stupid

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class StupidTest {

    @Test
    fun testSupportedLocal() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext

        assertEquals(appContext.resources.getString(R.string.stupid), Stupid.forLocale())
        assertEquals("stupid", Stupid.forLocale(Locale.ROOT))
        assertEquals(appContext.resources.getString(R.string.stupid), Stupid.forLocale(null))
        assertEquals("stupid", Stupid.forLocale(Locale.UK))
        assertEquals("stupid", Stupid.forLocale(Locale.ENGLISH))
        assertEquals("stupid", Stupid.forLocale(Locale.CANADA))
        assertEquals("stupid", Stupid.forLocale(Locale.US))
        assertEquals("blöd", Stupid.forLocale(Locale.GERMANY))
        assertEquals("blöd", Stupid.forLocale(Locale.GERMAN))
        assertEquals("stupido", Stupid.forLocale(Locale.ITALIAN))
        assertEquals("stupido", Stupid.forLocale(Locale.ITALY))
        assertEquals("stupide", Stupid.forLocale(Locale.FRANCE))
        assertEquals("stupide", Stupid.forLocale(Locale.FRENCH))
        assertEquals("stupide", Stupid.forLocale(Locale.CANADA_FRENCH))
        assertEquals("바보", Stupid.forLocale(Locale.KOREA))
        assertEquals("바보", Stupid.forLocale(Locale.KOREAN))
    }

    @Test
    fun testUnsupportedLocal() {

        // ATTENTION: This test is not conclusive for all locals

        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.JAPANESE))
        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.JAPAN))
        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.CHINESE))
        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.CHINA))
        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.PRC))
        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.SIMPLIFIED_CHINESE))
        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.TAIWAN))
        assertEquals(Stupid.forLocale(Locale.ROOT), Stupid.forLocale(Locale.TRADITIONAL_CHINESE))
    }

}
