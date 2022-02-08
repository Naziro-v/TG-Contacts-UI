package com.nazirov.contactsui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var context: Context, var contacts:ArrayList<Contact>):RecyclerView.Adapter<RecyclerView.ViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view  = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ContactViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var contact = contacts[position]

        if (holder is ContactViewHolder){
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_activity = holder.tv_activity

            iv_profile.setImageResource(contact.profile)
            tv_fullname.text = contact.fullname
            tv_activity.text = contact.activition

        }

    }

    override fun getItemCount(): Int {
        return contacts.size
    }
    class ContactViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        var iv_profile : ImageView = view.findViewById(R.id.iv_profile)
        var tv_fullname : TextView = view.findViewById(R.id.tv_fullname)
        var tv_activity : TextView = view.findViewById(R.id.tv_activity)
    }
}