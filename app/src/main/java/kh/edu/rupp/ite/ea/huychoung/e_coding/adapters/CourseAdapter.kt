package kh.edu.rupp.ite.ea.huychoung.e_coding.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ItemCourseLayoutBinding
import kh.edu.rupp.ite.ea.huychoung.e_coding.models.CourseModel

class CourseAdapter(
    private val courseList: List<CourseModel>,
    private val onItemClicked: (CourseModel) -> Unit = {}
) :
    RecyclerView.Adapter<CourseAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemCourseLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(course: CourseModel) {
            binding.title.text = course.title
            binding.description.text = course.desc
            binding.duration.text = "${course.duration}  h"
            binding.status.text = "$ ${course.status}"
            binding.image.setImageResource(course.image!!)

            binding.root.setOnClickListener {
                onItemClicked(course)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            ItemCourseLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(courseList[position])
    }
}