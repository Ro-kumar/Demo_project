package com.techvista.demoapps.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.techvista.demoapps.Model.Product
import com.techvista.demoapps.R
import com.techvista.demoapps.databinding.CategoryRvBinding

class CategoryAdapter(var context: Context,var list: MutableList<Product>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: CategoryRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding =
            CategoryRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.offerText.text=list[position].discountPercentage.toString()+"% \n off"
        holder.binding.title.text=list[position].title
        holder.binding.brand.text=list[position].brand
        holder.binding.categoryName.text=list[position].category
        holder.binding.ratingTxt.text=list[position].rating.toString()
        holder.binding.price.text="₹ "+list[position].price.toString()

        Picasso.get()
            .load(
                list[position].thumbnail
                )
            .placeholder(
                R.drawable.logo
            )
            .into(holder.binding.coverImg)


    }
}