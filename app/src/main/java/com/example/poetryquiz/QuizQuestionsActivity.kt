package com.example.poetryquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private lateinit var giviko: TextView
    private lateinit var zviadi: TextView
    private lateinit var surati: ImageView
    private lateinit var pirveli: TextView
    private lateinit var meore: TextView
    private lateinit var mesame: TextView
    private lateinit var meotxe: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition -1]

        progressBar.progress = currentPosition
        giviko = findViewById(R.id.tv_progress)
        giviko.text = "$currentPosition" + "/" + progressBar.max
        zviadi = findViewById(R.id.tv_question)
        zviadi.text = question!!.question
        surati = findViewById(R.id.iv_image)
        surati.setImageResource(question.image)
        pirveli = findViewById(R.id.tv_option_one)
        pirveli.text = question.optionOne
        meore = findViewById(R.id.tv_option_two)
        meore.text = question.optionTwo
        mesame = findViewById(R.id.tv_option_three)
        mesame.text = question.optionThree
        meotxe = findViewById(R.id.tv_option_four)
        meotxe.text = question.optionFour












    }
}