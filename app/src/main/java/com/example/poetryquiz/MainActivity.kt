package com.example.poetryquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button
    private lateinit var konguser: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.btn_start)
        konguser = findViewById(R.id.et_name)
        startButton.setOnClickListener {
            if(konguser.text.toString().isEmpty()){
                Toast.makeText(this, "გთხოვთ,შეიყვანოთ თქვენი სახელი!", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }







    }
}