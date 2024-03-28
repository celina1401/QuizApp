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
            correctAnswer = 1
        )
        questionList.add(q1)
        val q2 = Question(
            id = 2,
            question = "Who is he?",
            image = R.drawable.thaytri,
            op1 = "Thầy Huỳnh Ngọc Thái Anh",
            op2 = "Thầy Nguyễn Hữu Hòa",
            op3 = "Thầy Trang Thanh Trí",
            op4 = "Thầy Võ Trí Thức",
            correctAnswer = 2
        )
        questionList.add(q2)
        val q3 = Question(
            id = 3,
            question = "Who is he?",
            image = R.drawable.thaytri,
            op1 = "Thầy Huỳnh Ngọc Thái Anh",
            op2 = "Thầy Nguyễn Hữu Hòa",
            op3 = "Thầy Trang Thanh Trí",
            op4 = "Thầy Võ Trí Thức",
            correctAnswer = 3
        )
        questionList.add(q3)
        val q4 = Question(
            id = 4,
            question = "Who is he?",
            image = R.drawable.thaytri,
            op1 = "Thầy Huỳnh Ngọc Thái Anh",
            op2 = "Thầy Nguyễn Hữu Hòa",
            op3 = "Thầy Trang Thanh Trí",
            op4 = "Thầy Võ Trí Thức",
            correctAnswer = 4
        )
        questionList.add(q4)
        return questionList
    }
}