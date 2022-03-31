package com.example.telegram_app_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_app_ui.adpter.ChatAdapterContact
import com.example.telegram_app_ui.model.Contact

class ContactActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    var imageView:ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        val imageView:ImageView? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        initViews()
    }

    private fun initViews() {
        imageView = findViewById(R.id.iv_settings)
        imageView!!.setOnClickListener(View.OnClickListener {
            openNotifications()
        })

        imageView = findViewById(R.id.iv_back_main_activity)
        imageView!!.setOnClickListener(View.OnClickListener {
            backMainActivity()
        })

        recyclerView = findViewById(R.id.recyclerView_contacts)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(getAllContact())
    }

    fun openNotifications(){
        var intent = Intent(this,NotificationActivity::class.java)
        startActivity(intent)
    }

    fun backMainActivity(){
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun refreshAdapter(contacts:ArrayList<Contact>){
        val adapter = ChatAdapterContact(this,contacts)
        recyclerView!!.adapter = adapter
    }

    fun getAllContact():ArrayList<Contact>{
        val contacts:ArrayList<Contact> = ArrayList<Contact>()

        contacts.add(Contact(R.drawable.im_user1,"Akmal"))
        contacts.add(Contact(R.drawable.im_user2,"Tohir"))
        contacts.add(Contact(R.drawable.im_user2,"Akmal"))
        contacts.add(Contact(R.drawable.im_user1,"Tohir"))
        contacts.add(Contact(R.drawable.im_user2,"Akmal"))
        contacts.add(Contact(R.drawable.im_user1,"Tohir"))
        contacts.add(Contact(R.drawable.im_user2,"Akmal"))
        contacts.add(Contact(R.drawable.im_user1,"Tohir"))
        contacts.add(Contact(R.drawable.im_user2,"Tohir"))
        contacts.add(Contact(R.drawable.im_user1,"Akmal"))
        contacts.add(Contact(R.drawable.im_user2,"Akmal"))
        contacts.add(Contact(R.drawable.im_user1,"Akmal"))
        contacts.add(Contact(R.drawable.im_user1,"Akmal"))
        contacts.add(Contact(R.drawable.im_user1,"Akmal"))
        contacts.add(Contact(R.drawable.im_user1,"Akmal"))
        return contacts
    }

}