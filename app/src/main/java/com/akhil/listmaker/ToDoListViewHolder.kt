package com.akhil.listmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var ListPositionTextView = itemView.findViewById<TextView>(R.id.itemNumber)
    var ListTileTextView = itemView.findViewById<TextView>(R.id.itemString)
}