package com.sample.android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.android.R
import com.sample.android.domain.model.User

class UserAdapter : ListAdapter<User, UserAdapter.UserViewHolder>(UserDiffCallback())
{
    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(user: User)
        {
            itemView.findViewById<TextView>(R.id.username).text = user.username
            Glide.with(itemView.context).load(user.avatarUrl).into(itemView.findViewById(R.id.avatar))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int)
    {
        holder.bind(getItem(position))
    }
}

class UserDiffCallback : DiffUtil.ItemCallback<User>()
{
    override fun areItemsTheSame(old: User, new: User) = old.id == new.id
    override fun areContentsTheSame(old: User, new: User) = old == new
}