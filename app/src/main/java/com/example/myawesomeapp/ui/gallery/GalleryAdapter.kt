package com.example.myawesomeapp.ui.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myawesomeapp.R
import com.google.android.material.snackbar.Snackbar
import ru.kkuzmichev.simpleappforespresso.ui.gallery.GalleryItem

class GalleryAdapter(itemList: List<GalleryItem>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    private val itemList: List<GalleryItem>

    init {
        this.itemList = itemList
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.list_item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.itemTitle.text = item.title
        holder.itemDescription.text = item.description
        holder.itemNumber.text = item.number.toString()
        holder.itemTitle.setOnClickListener { view ->
            Snackbar.make(view, "Item #${item.number} clicked successfully!", Snackbar.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.item_title)
        val itemDescription: TextView = itemView.findViewById(R.id.item_description)
        val itemNumber: TextView = itemView.findViewById(R.id.item_number)
    }
}