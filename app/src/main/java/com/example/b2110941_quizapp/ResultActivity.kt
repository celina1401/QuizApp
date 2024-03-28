package com.example.b2110941_quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.b2110941_quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var userName = intent.getStringExtra(Constants.USER_NAME)
        var total_question = intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        var correctAnwser = intent.getIntExtra(Constants.CORRECT_ANWSERS,0)

        binding.tvScore.text = "Your score is $correctAnwser out of $total_question"
        binding.tvName.text = userName

        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}