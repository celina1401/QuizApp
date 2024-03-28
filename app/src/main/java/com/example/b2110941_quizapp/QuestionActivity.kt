package com.example.b2110941_quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.b2110941_quizapp.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {
    private var currentPosition: Int = 1
    private var QList:ArrayList<Question>? = null
    private var myOption:Int = 0
    private var correctAnswer:Int = 0
    private var mUsername: String? = null

    lateinit var binding:ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mUsername = intent.getStringExtra(Constants.USER_NAME)
        QList = Constants.getQuestion()
        binding.progressBar.max = QList?.size!! //Tranh loi null pointer
        correctAnswer = 0
        myOption = 0
        setQuetion()
        defaultOV()

        binding.A.setOnClickListener { setSelectAnwser(binding.A,1) }
        binding.B.setOnClickListener { setSelectAnwser(binding.B,2) }
        binding.C.setOnClickListener { setSelectAnwser(binding.C,3) }
        binding.D.setOnClickListener { setSelectAnwser(binding.D,4) }
        binding.submit.setOnClickListener { onSubmit() }
    }
    private fun defaultOV(){
        val options = ArrayList<TextView>()
        options.add(binding.A)
        options.add(binding.B)
        options.add(binding.C)
        options.add(binding.D)
        for (select in options){
            select.typeface = Typeface.DEFAULT
            select.setBackgroundResource(R.drawable.answer_shape)
            select.setTextColor(Color.parseColor("#7a8089"))
        }

    }
    private fun setQuetion() {
        defaultOV()
        val question: Question = QList!![currentPosition - 1]
        binding.progressBar.progress = currentPosition
        binding.progressTV.text = "$currentPosition/${binding.progressBar.max}"

        binding.tvQuestion.text = question.question
        binding.A.text = question.op1
        binding.B.text = question.op2
        binding.C.text = question.op3
        binding.D.text = question.op4

        binding.img.setBackgroundResource(question.image)

        if(currentPosition == QList!!.size){
            binding.submit.text = "FINISH"
        }
        else{
            binding.submit.text = "SUBMIT"
        }
    }

    private fun setSelectAnwser(view: TextView, selectIndex:Int){
        defaultOV()
        myOption = selectIndex
        view.setTextColor(Color.parseColor("#363A43"))
        view.setTypeface(view.typeface, Typeface.BOLD)
        view.setBackgroundResource(R.drawable.set_select_option)
    }

    private fun answerView(select: Int, drawable:Int){
        when (select){
            1 -> {
                binding.A.setBackgroundResource(drawable)
            }
            2 -> {
                binding.B.setBackgroundResource(drawable)
            }
            3 -> {
                binding.C.setBackgroundResource(drawable)
            }
            4 -> {
                binding.D.setBackgroundResource(drawable)
            }
        }
    }

    private fun onSubmit() {
        if (myOption == 0) {
            currentPosition++
            when {
                currentPosition <= QList!!.size -> {
                    setQuetion()
                }

                else -> {
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(Constants.USER_NAME, mUsername)
                    intent.putExtra(Constants.CORRECT_ANWSERS, correctAnswer)
                    intent.putExtra(Constants.TOTAL_QUESTION, QList!!.size)
                    startActivity(intent)
                    finish()
                }
            }
        }
        else {
            val question = QList?.get(currentPosition-1)
            if (question!!.correctAnswer != myOption){
                answerView(myOption,R.drawable.wrong_select_option)
            } else {
                correctAnswer++
            }
            answerView(question!!.correctAnswer,R.drawable.correct_select_answer) //luon hien du dung hay sai

            if (currentPosition == QList!!.size){
                binding.submit.text = "FINISH"
            }
            else {
                binding.submit.text = "GO TO THE NEXT QUESTION"
            }
            myOption = 0
        }

    }
}