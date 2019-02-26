package de.eosn.stupid.lib

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.eosn.stupid.Stupid
import de.eosn.stupid.math.add
import de.eosn.stupid.math.mul
import de.eosn.stupid.math.sub

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.stupidTextView).text = Stupid.forLocale()

        val a = 4
        val b = 6
        Log.i(TAG, "FYI: $a + $b = ${add(a, b)}")
        Log.i(TAG, "FYI: $a - $b = ${sub(a, b)}")
        Log.i(TAG, "FYI: $a * $b = ${mul(a, b)}")
    }
}
