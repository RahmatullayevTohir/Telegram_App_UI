package com.example.telegram_app_ui.adpter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_app_ui.R
import com.example.telegram_app_ui.model.Contact
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapterContact(var context: Context,var items:ArrayList<Contact>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contacts_view, parent,false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contact = items[position]

        if (holder is ContactViewHolder){
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname

            iv_profile.setImageResource(contact.profile)
            tv_fullname.text = contact.fullname
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ContactViewHolder(var view: View):RecyclerView.ViewHolder(view){
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile_contact)
            tv_fullname = view.findViewById(R.id.tv_fullname_contact)
        }
    }
}