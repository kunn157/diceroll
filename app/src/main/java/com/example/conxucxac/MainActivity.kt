package com.example.conxucxac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            rollDice1()
            rollDice2()
            sum1()
        }
    }

    private fun sum1() {
        val resultTextView0: TextView=findViewById(R.id.textView3)
        val resultTextView1: TextView = findViewById(R.id.textView2)
        val resultTextView2: TextView = findViewById(R.id.textView4)
        val resultTextView3: TextView = findViewById(R.id.textView5)

        val number1 = resultTextView1.text.toString().toInt()
        val number2 = resultTextView2.text.toString().toInt()
        val number3 = resultTextView0.text.toString().toInt()
        val sum = number1+number2+number3
        resultTextView3.setText("Kết quả $sum")
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
       val resultTextView: TextView = findViewById(R.id.textView2)
        val diceImage: ImageView =  findViewById(R.id.imageView)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = "$diceRoll"
       resultTextView.text = diceRoll.toString()
    }
    private fun rollDice1() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView4)
        val diceImage: ImageView = findViewById(R.id.imageView1)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultTextView.text = diceRoll.toString()
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = "$diceRoll"
    }
    private fun rollDice2() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)
        val resultTextView1: TextView = findViewById(R.id.textView3)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultTextView1.text= diceRoll.toString()
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = "$diceRoll"
    }
}
class Dice( private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
