package com.example.hw_3_5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class LessonAdapter : RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    private var list = arrayListOf<LessonModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_lesson, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(list: ArrayList<LessonModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class LessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var image: ImageView = itemView.findViewById(R.id.lesson_image)
        private var title: TextView = itemView.findViewById(R.id.lesson_text)

        fun bind(lessonModel: LessonModel) {
            title.text = lessonModel.titleLesson
            Glide.with(itemView).load(lessonModel.imageLesson).into(image)
            lessonModel.backItem.let { itemView.context.getColor(it) }
                .let { itemView.setBackgroundColor(it) }
            lessonModel.backItemBottom.let { itemView.context.getColor(it) }
                .let { title.setBackgroundColor(it) }
        }

    }
}
