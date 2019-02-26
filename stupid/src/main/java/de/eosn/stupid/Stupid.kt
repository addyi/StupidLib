package de.eosn.stupid

import android.app.Application
import android.content.res.Configuration
import android.content.res.Resources
import android.util.Log
import com.github.florent37.application.provider.ApplicationProvider
import java.util.*


class Stupid {

    companion object {

        private val TAG: String = Stupid::class.java.simpleName

        @JvmStatic
        fun forLocal(locale: Locale?): String {
            val context = ApplicationProvider.application
            return if (context != null) {
                getLocalizedResources(context, locale).getString(R.string.stupid)
            } else {
                if (BuildConfig.DEBUG) {
                    Log.e(TAG, "Application Context is null. Returned default stupid value.")
                }
                "stupid"
            }
        }

        @JvmStatic
        fun forLocal(): String {
            return forLocal(null)
        }

        private fun getLocalizedResources(context: Application, desiredLocale: Locale?): Resources {
            return if (desiredLocale == null) {
                context.resources
            } else {
                var conf = context.resources.configuration
                conf = Configuration(conf)
                conf.setLocale(desiredLocale)
                val localizedContext = context.createConfigurationContext(conf)
                localizedContext.resources
            }
        }
    }
}