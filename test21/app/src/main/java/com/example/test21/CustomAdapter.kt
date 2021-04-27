package com.example.test21

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class Data(val profile: Int, val name :String)


class CustomAdapter (val context : Context, val DataList : ArrayList<Data>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }
}