package kh.edu.rupp.ite.ea.huychoung.e_coding.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ItemCourseDetailLayoutBinding
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ItemCourseLayoutBinding
import kh.edu.rupp.ite.ea.huychoung.e_coding.models.CourseDetailModel
import kh.edu.rupp.ite.ea.huychoung.e_coding.models.CourseModel

class CourseDetailAdapter(
    private val courseList: List<CourseDetailModel>,
    private val onItemClicked: (CourseDetailModel) -> Unit = {}
) :
    RecyclerView.Adapter<CourseDetailAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemCourseDetailLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(course: CourseDetailModel) {
            binding.title.text = course.title
            binding.description.text = course.description
            binding.duration.text = "${course.duration}  h"
            binding.image.setImageResource(course.image!!)

            binding.root.setOnClickListener {
                onItemClicked(course)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            ItemCourseDetailLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(courseList[position])
    }
}