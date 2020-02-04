package com.example.recyclerview_kotlin.adapter

import com.example.recyclerview_kotlin.models.Model

class DataSource {

    companion object{
        fun crateDtaSet(): ArrayList<Model>{
            val list = ArrayList<Model>()
            list.add(Model(
                    "Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"
                )
            )
            list.add(Model(
                "Монипулятор верхнего типа",
                "REST IP",
                "https://klike.net/uploads/posts/2019-03/medium/1551512888_2.jpg"))
            list.add(Model(
                "Монипулятор верхнего типа",
                "REST IP",
                "https://klike.net/uploads/posts/2019-03/medium/1551512888_2.jpg"))
            list.add(Model(
                "Монипулятор верхнего типа",
                "REST IP",
                "https://klike.net/uploads/posts/2019-03/medium/1551512888_2.jpg"))
            list.add(Model(
                "Монипулятор верхнего типа",
                "REST IP",
                "https://klike.net/uploads/posts/2019-03/medium/1551512888_2.jpg"))
            list.add(Model(
                "Монипулятор верхнего типа",
                "REST IP",
                "https://klike.net/uploads/posts/2019-03/medium/1551512888_2.jpg"))
            list.add(Model(
                "Монипулятор верхнего типа",
                "REST IP",
                "https://klike.net/uploads/posts/2019-03/medium/1551512888_2.jpg"))
            list.add(Model(
                "Монипулятор верхнего типа",
                "REST IP",
                "https://klike.net/uploads/posts/2019-03/medium/1551512888_2.jpg"))

            return list
        }
//        https://www.youtube.com/watch?v=Jo6Mtq7zkkg
    }
}