package vn.edu.hust.fmail

import android.graphics.Color
import android.widget.Button
import kotlin.random.Random

data class Item(
    val sender: String,
    val message: String,
    val time: String,

){
    var color: Int = generateRandomColor()
    var checkBox: Boolean = false
    fun generateRandomColor(): Int {
        val random = Random
        val r: Int = random.nextInt(256)
        val g: Int = random.nextInt(256)
        val b: Int = random.nextInt(256)
        return Color.rgb(r, g, b)
    }

}

