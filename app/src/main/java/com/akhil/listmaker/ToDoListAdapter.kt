package com.akhil.listmaker

import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView

class ToDoListAdapter: RecyclerView.Adapter<ToDoListViewHolder>() {
    private val toDolists = arrayOf("Android Devolopment, Housework, Errands")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoListAdapter {
        val View = LayoutInflater.from(parent.context)
        .inflate(R.layout.todo_list_view_holder, parent, false)
        return TodoListsViewHolder(View)


    }

    override fun onBindViewHolder(holder: ToDoListViewHolder, position: Int) {
        holder.ListPositionTextView.text = (position + 1).toString()
        holder.ListTileTextView.text = toDolists[position]
    }

    override fun getItemCount(): Int {
        return toDolists.size
    }
}
