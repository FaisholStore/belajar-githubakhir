package com.dicoding.aplikasi_github.UI.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.dicoding.aplikasi_github.Data.Model.User
import com.dicoding.aplikasi_github.databinding.ItemUserBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private val userList = ArrayList<User>()

    fun updateData(user: ArrayList<User>) {
        userList.clear()
        userList.addAll(user)
        notifyDataSetChanged()
    }
    inner class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
           binding.apply {
               Glide.with(itemView)
                   .load(user.avatar_url)
                   .transition(DrawableTransitionOptions.withCrossFade())
                   .centerCrop()
                   .into(ivUser)
               tvUsername.text =user.login
           }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
    }


    override fun getItemCount(): Int = userList.size



}
