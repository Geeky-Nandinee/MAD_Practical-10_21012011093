package com.example.mad_practical_10_21012011093

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class PersonAdapter (context:Context, val PersonArray:ArrayList<Person> ):ArrayAdapter<Person>(context,0,PersonArray){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val view= LayoutInflater.from(context).inflate()
    }

}