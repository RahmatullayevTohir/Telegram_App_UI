package com.example.telegram_app_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_app_ui.adpter.ChatAdapter
import com.example.telegram_app_ui.model.Chat

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var imageView:ImageView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        imageView = findViewById(R.id.iv_launch)
        imageView!!.setOnClickListener(View.OnClickListener {
            openContactActivity()
        })
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(getAllChats())
    }

    fun openContactActivity(){
        var intent = Intent(this,ContactActivity::class.java)
        startActivity(intent)
    }

    fun refreshAdapter(chats:ArrayList<Chat>){
        val adapter = ChatAdapter(this,chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{
        val chats:ArrayList<Chat> = ArrayList<Chat>()

        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user2,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user2,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user2,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user2,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        chats.add(Chat(R.drawable.im_user1,"Tohir","Salom"))
        return chats
    }
}