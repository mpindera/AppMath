package com.example.myquizappbeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOne = findViewById<Button>(R.id.btnOne)
        val btnTwo = findViewById<Button>(R.id.btnTwo)
        val btnThree = findViewById<Button>(R.id.btnThree)
        val btnFour = findViewById<Button>(R.id.btnFour)
        val btnFive = findViewById<Button>(R.id.btnFive)
        val btnSix = findViewById<Button>(R.id.btnSix)
        val btnSeven = findViewById<Button>(R.id.btnSeven)
        val btnEight = findViewById<Button>(R.id.btnEight)
        val btnNine = findViewById<Button>(R.id.btnNine)
        val btnZero = findViewById<Button>(R.id.btnZero)
        val btnClean = findViewById<Button>(R.id.clean)
        val btnAccept = findViewById<Button>(R.id.accept)
        val btnRandomChoiceFirst = findViewById<Button>(R.id.randomNumFirst)
        val btnRandomChoiceSecond = findViewById<Button>(R.id.randomNumSecond)
        val btnRandomChoiceThird = findViewById<Button>(R.id.randomNumThrid)

        val textFirstNum = findViewById<TextView>(R.id.firstNum)
        val textSecondNum = findViewById<TextView>(R.id.secondNum)
        val textResultNum = findViewById<TextView>(R.id.resultNum)
        val textScoreCount = findViewById<TextView>(R.id.scoreCount)

        var name = ""
        var count = 0

        textScoreCount.text = count.toString()
        textResultNum.text = ""
        textFirstNum.text = ""
        textSecondNum.text = ""

        btnRandomChoiceFirst.setOnClickListener {
            textFirstNum.text = randomFirst()
            textSecondNum.text = randomFirst()
            textResultNum.text = ""
            name = ""
        }
        btnRandomChoiceSecond.setOnClickListener {
            textFirstNum.text = randomSecond()
            textSecondNum.text = randomSecond()
            textResultNum.text = ""
            name = ""
        }
        btnRandomChoiceThird.setOnClickListener {
            textFirstNum.text = randomThird()
            textSecondNum.text = randomThird()
            textResultNum.text = ""
            name = ""
        }
        btnOne.setOnClickListener {
            if (name.length < 2) {
                name += btnOne.text
                textResultNum.text = name
            }
        }
        btnTwo.setOnClickListener {
            if (name.length < 2) {
                name += btnTwo.text
                textResultNum.text = name
            }
        }
        btnThree.setOnClickListener {
            if (name.length < 2) {
                name += btnThree.text
                textResultNum.text = name
            }
        }
        btnFour.setOnClickListener {
            if (name.length < 2) {
                name += btnFour.text
                textResultNum.text = name
            }
        }
        btnFive.setOnClickListener {
            if (name.length < 2) {
                name += btnFive.text
                textResultNum.text = name
            }
        }
        btnSix.setOnClickListener {
            if (name.length < 2) {
                name += btnSix.text
                textResultNum.text = name
            }
        }
        btnSeven.setOnClickListener {
            if (name.length < 2) {
                name += btnSeven.text
                textResultNum.text = name
            }
        }
        btnEight.setOnClickListener {
            if (name.length < 2) {
                name += btnEight.text
                textResultNum.text = name
            }
        }
        btnNine.setOnClickListener {
            if (name.length < 2) {
                name += btnNine.text
                textResultNum.text = name
            }
        }
        btnZero.setOnClickListener {
            if (name.length < 2) {
                name += btnZero.text
                textResultNum.text = name
            }
        }
        btnClean.setOnClickListener {
            textResultNum.text = ""
            name = ""
        }
        btnAccept.setOnClickListener {
            if ((textFirstNum.text == "") || (textSecondNum.text == "") || (textResultNum.text == "")) {
                Toast.makeText(this, "Wpisz wynik", Toast.LENGTH_SHORT).show()
            } else if ((textFirstNum.text.toString().toInt() + textSecondNum.text.toString()
                    .toInt()) == textResultNum.text.toString().toInt()
            ) {
                Toast.makeText(this, "Brawo, dobra robota", Toast.LENGTH_SHORT).show()
                ++count
                textScoreCount.text = count.toString()
            } else {
                Toast.makeText(this, "Błąd, coś musisz poprawić", Toast.LENGTH_SHORT).show()
                if (count > 0) {
                    count--
                    textScoreCount.text = count.toString()
                }
            }
        }

    }

    private var arrayFirst: List<Int> = listOf(
        1, 2, 3, 4, 5,
        6, 7, 8, 9, 10,
        11, 12, 13, 14,
        15, 16, 17, 18,
        19, 20
    )
    private var arraySecond: ArrayList<Int> = arrayListOf(
        21, 22, 23, 24,
        25, 26, 27, 28,
        29, 30
    )
    private var arrayThird: ArrayList<Int> = arrayListOf(
        31, 32, 33, 34, 35, 36, 37, 38,
        39, 40, 41, 42,
        43, 44, 45, 46, 47, 48, 49
    )

    private fun randomFirst(): String {
        val randomIndex = Random.nextInt(arrayFirst.size)
        return arrayFirst[randomIndex].toString()
    }

    private fun randomSecond(): String {
        val randomIndex = Random.nextInt(arraySecond.size)
        return arraySecond[randomIndex].toString()
    }

    private fun randomThird(): String {
        val randomIndex = Random.nextInt(arrayThird.size)
        return arrayThird[randomIndex].toString()
    }
}