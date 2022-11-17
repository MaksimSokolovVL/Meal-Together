package com.example.mealtogether.temp_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mealtogether.R

class ListAdapter: RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private val listItem = listOf<ListItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder { //как создавать
         val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_shape, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ListViewHolder, position: Int) { //во время скрола  -> что делаем с данными внутри созданного view
        val listItem = listItem[position]
        viewHolder.name.text = listItem.name
        viewHolder.countView.text = listItem.count.toString()
        viewHolder.view.setOnLongClickListener {
            true
        }
    }



    override fun getItemCount(): Int {  //количество элементов в коллекции
        return listItem.size
    }

    class ListViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.text_title_view)
        val countView: TextView = view.findViewById(R.id.text_count_view)
    }
}