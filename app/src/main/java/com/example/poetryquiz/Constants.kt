package com.example.poetryquiz

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "რომელ პოეტს ეკუთვნის ლექსი 'მთაწმინდის მთვარე?'",
            R.drawable.galak_tioni, "გალაკტიონ ტაბიძე",
            "ილია ჭავჭავაძე",
            "გაგა ნახუცრიშვილი" ,
            "ალექსანდრე აბაშელი",
            1
        )

        questionsList.add(que1)

        val que2 = Question(2, "რომელ პოეტს ეკუთვნის ლექსი 'არ ვიცი,ასე რამ შემაყვარა!'?",
        R.drawable.giorgi_eonidze,
            "ნიკოლოზ ბარათაშვილი",
            "კოლაუ ნადირაძე",
            "გიორგი ლეონიძე",
            "ლადო ასათიანი", 3
        )
        questionsList.add(que2)

        val que3 = Question(3, "რომელ პოეტს ეკუთვნის ლექსი 'ადამიანი გაზეთის სვეტში'?",
        R.drawable.otar_chila,
            "მირზა გელოვანი",
            "ტერენტი გრანელი",
            "მუხრან მაჭავარიანი",
            "ოთარ ჭილაძე",
            4)

        questionsList.add(que3)

        val que4 = Question(4, "რომელ პოეტს ეკუთვნის პოემა 'გამზრდელი'?",
        R.drawable.akaki_wereteli,
            "აკაკი წერეთელი",
            "მურმან ლებანიძე",
            "ილია ჭავჭავაძე",
            "ვაჟა-ფშაველა",
            1
        )

        questionsList.add(que4)

        val que5 = Question(5, "რომელი პოეტი წერდა ელენე დარიანის ფსევდონიმით?",
        R.drawable.paolo_ia,
            "ტიციან ტაბიძე",
            "ვალერიან გაფრინდაშვილი",
            "სიმონ ჩიქოვანი",
            "პაოლო იაშვილი",
            4)

        questionsList.add(que5)

        val que6 = Question(6, "რომელ პოეტს ეკუთვნის 'ლექსი მეწყერი'?",
        R.drawable.ti_ciani,
            "იოსებ ნონეშვილი",
            "ტიციან ტაბიძე",
            "გრიგოლ აბაშიძე",
            "თამაზ ჭილაძე",
            2
        )
        questionsList.add(que6)

        val que7 = Question(7, "რომელ პოეტს ეკუთვნის ლექსი 'თუთა'?",
        R.drawable.ana_kalandadze,
            "ანა კალანდაძე",
            "ელენე დარიანი",
            "ეკატერინე გაბაშვილი",
            "კატო მიქელაძე",
            1)
        questionsList.add(que7)




        return questionsList
    }

}