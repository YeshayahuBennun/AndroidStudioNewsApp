package com.ybennun.newsapp

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/*class CustomAdaptor(var arrayList: ArrayList<Data>) : BaseAdapter() {
    override fun getCount() = arrayList.size

    override fun getItem(position: Int) = arrayList[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context
        var rowView: View? = convertView
        var path: Uri? = null

        var inflater: LayoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

        if(rowView==null)
            rowView =  inflater.inflate(R.layout.item_list,parent,false)

        val item = arrayList[position]

        val newsTextView = rowView?.findViewById<TextView>(R.id.news_text_view)

    }

    private void goToUrl(String s){
    Uri uri = Uri.parse(s)
    startActivity(new Internet(Intent.ACTION_VIEW,uri))
    }

}*/


