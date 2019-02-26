package de.eosn.stupid.lib

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.eosn.stupid.Stupid

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.stupidTextView).text = Stupid.forLocale()
    }
}
