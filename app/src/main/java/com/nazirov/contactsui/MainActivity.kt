package com.nazirov.contactsui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        refreshAdapter(getAllContacts())



    }

    fun refreshAdapter(contacts: ArrayList<Contact>) {
        var adapter = ContactAdapter(this,contacts)
        recyclerView!!.adapter = adapter
    }
    fun getAllContacts() : ArrayList<Contact>{
        var contacts :ArrayList<Contact> = ArrayList<Contact>()

        contacts.add(Contact(R.drawable.img_2,"Nazirov Elmurod","Last seen recently"))
        contacts.add(Contact(R.drawable.img_3,"Muhammad Soli", "Last seen recently "))
        contacts.add(Contact(R.drawable.img_4,"Nurmuhammad", " Last seen recently"))
        contacts.add(Contact(R.drawable.img_5,"Abdulaziz", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_6,"Og`abekDev", " Last seen recently"))
        contacts.add(Contact(R.drawable.img_7,"Doston Aka", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_8,"Samandar", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_9,"Azizbek", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_2,"Nazirov Elmurod","Last seen recently"))
        contacts.add(Contact(R.drawable.img_3,"Muhammad Soli", "Last seen recently "))
        contacts.add(Contact(R.drawable.img_4,"Nurmuhammad", " Last seen recently"))
        contacts.add(Contact(R.drawable.img_5,"Abdulaziz", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_6,"Og`abekDev", " Last seen recently"))
        contacts.add(Contact(R.drawable.img_7,"Doston Aka", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_8,"Samandar", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_9,"Azizbek", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_2, "Nazirov Elmurod", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_3, "Muhammad Soli", "Last seen recently "))
        contacts.add(Contact(R.drawable.img_4, "Nurmuhammad", " Last seen recently"))
        contacts.add(Contact(R.drawable.img_5, "Abdulaziz", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_6, "Og`abekDev", " Last seen recently"))
        contacts.add(Contact(R.drawable.img_7, "Doston Aka", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_8, "Samandar", "Last seen recently"))
        contacts.add(Contact(R.drawable.img_9, "Azizbek", "Last seen recently"))

        return contacts



    }
}