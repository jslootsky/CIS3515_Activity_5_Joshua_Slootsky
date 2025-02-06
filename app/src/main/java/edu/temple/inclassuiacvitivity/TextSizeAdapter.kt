package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

//added constructors to access different aspects of the adapter
class TextSizeAdapter(private val context: Context, private val sizes: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return sizes.size
    }

    override fun getItem(position: Int): Any {
        return sizes[position]
    }

    override fun getItemId(position: Int): Long {
        return sizes[position].toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //ensures textView is always a textView object, returns null otherwise
        val textView = convertView as? TextView ?: TextView(context)
        //accesses the sizes array sets the spinner text to the selected size in the array
        textView.text = sizes[position].toString()
        //sets the selected text size to always be 22f as instructed
        textView.textSize = 22f
        return textView
    }

    //sets the dropdown elements to their respective sizes
    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //ensures textView is a textView as previously implemented
        val textView = convertView as? TextView ?: TextView(context)
        textView.text = sizes[position].toString()
        textView.textSize = sizes[position].toFloat()
        return textView
    }

}