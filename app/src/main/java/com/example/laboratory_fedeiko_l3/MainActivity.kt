package com.example.laboratory_fedeiko_l3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var newRecyclerView: RecyclerView
    private  lateinit var newArrayList : ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k
        )
        heading = arrayOf(
            "Hi, my name is Red Cat 🔴. My job title is engineer.",
            "Hi, my name is Cinger Cat 🟠. My job title is a tester.",
            "Hi, my name is Grey Cat ⚫. My job title is QA.",
            "Hi, my name is White Cat ⚪. My job title is designer.",
            "Hi, my name is Brown Cat 🟤. My job title is a manager.",
            "Hi, my name is Work Cat ‍💻. My job title is team lead.",
            "Hi, my name is Fire Cat 🔥. My job title is project manager.",
            "Hi, my name is Solar Cat 🌞. My job title is HR.",
            "Hi, my name is Little Cat 🐾. My job title is PM.",
            "Hi, my name is Betty Cat 🎀. My job title is SCRUM master."
        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {

        for(i in imageId.indices){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}