package buu.informatics.cs59160395.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBottun: Button = findViewById(R.id.roll_button)
        rollBottun.setOnClickListener { rollDicr() }

        val resetBottun: Button = findViewById(R.id.reset_button)
        resetBottun.setOnClickListener { resetText() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Roll"
    }

    private fun resetText(){
        val resetInt = 0
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = resetInt.toString()

        Toast.makeText(this, "button reset", Toast.LENGTH_SHORT).show()
    }

    private fun rollDicr(){
        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
