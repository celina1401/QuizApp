package com.example.b2110941_quizapp

object Constants {
    const val USER_NAME: String = "userName"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANWSERS: String = "correctAnwser"

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val q1 = Question(
            id = 1,
            question = "Who is he?",
            image = R.drawable.thaytri,
            op1 = "Thầy Huỳnh Ngọc Thái Anh",
            op2 = "Thầy Nguyễn Hữu Hòa",
            op3 = "Thầy Trang Thanh Trí",
            op4 = "Thầy Võ Trí Thức",
            correctAnswer = 3
        )
        questionList.add(q1)
        val q2 = Question(
            id = 2,
            question = "What does he do?",
            image = R.drawable.thaytri,
            op1 = "He's a billionaire",
            op2 = "He's a professor of College of Information and Communication Technology",
            op3 = "He's doctor",
            op4 = "He's a well-known Star in Showbiz",
            correctAnswer = 2
        )
        questionList.add(q2)
        val q3 = Question(
            id = 3,
            question = "When he was born?",
            image = R.drawable.thaytri,
            op1 = "21/6/1988",
            op2 = "20/2/1991",
            op3 = "18/6/1989",
            op4 = "26/12/2004",
            correctAnswer = 1
        )
        questionList.add(q3)
        val q4 = Question(
            id = 4,
            question = "Da App nay duoc 10 diem phai khong aj ?",
            image = R.drawable.thaytri,
            op1 = "Yes of course",
            op2 = "I'm OK",
            op3 = "This's also my idea",
            op4 = "All right",
            correctAnswer = 4
        )
        questionList.add(q4)
        return questionList
    }
}