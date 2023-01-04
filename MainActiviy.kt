package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{ rollDice() }

        rollDice()
}
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // create a new dice object with 6 sides and roll it
        val dice1 = Dice(6)
        val diceRoll = dice1.roll()

        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll2()

        // Find Image in layout for dice 1
        val diceImage: ImageView = findViewById(R.id.imageView2)

        // Find Image in layout for dice 2
        val diceImage2: ImageView = findViewById(R.id.imageView3)

        // Find Image in layout for dice 1
        // Determine which drawable resource ID to use based on the dice roll
       val drawableResource = when (diceRoll) {
            1 -> (R.drawable.dice_1)
            2 -> (R.drawable.dice_2)
            3 -> (R.drawable.dice_3)
            4 -> R.drawable.dice_4
            5 -> (R.drawable.dice_5)
            else -> (R.drawable.dice_6)
        }
        //Update the image view with the correct drawable Resource ID  for dice 1
        diceImage.setImageResource(drawableResource)

        // Find Image in layout for dice 2
        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource2 = when (diceRoll2) {
            1 -> (R.drawable.dice_1)
            2 -> (R.drawable.dice_2)
            3 -> (R.drawable.dice_3)
            4 -> R.drawable.dice_4
            5 -> (R.drawable.dice_5)
            else -> (R.drawable.dice_6)
        }
        //Update the image view with the correct drawable Resource ID for dice 2
        diceImage2.setImageResource(drawableResource2)
    }

}
class Dice (val numSides: Int){
    fun roll() : Int{
        return (1..numSides).random()
    }
    fun roll2():Int{
        return(1..numSides).random()
    }
}
