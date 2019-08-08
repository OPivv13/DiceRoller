package buu.informatics.cs59160395.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.contracts.contract

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBottun: Button = findViewById(R.id.roll_button)
        rollBottun.setOnClickListener { rollDicr() }
    }

    private fun rollDicr(){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
