package kh.edu.rupp.ite.ea.huychoung.e_coding.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kh.edu.rupp.ite.ea.huychoung.e_coding.R
import kh.edu.rupp.ite.ea.huychoung.e_coding.adapters.CourseAdapter
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.FragmentCourseBinding
import kh.edu.rupp.ite.ea.huychoung.e_coding.models.CourseModel
import kh.edu.rupp.ite.ea.huychoung.e_coding.ui.activities.CourseDetailActivity

class CourseFragment : Fragment(R.layout.fragment_course) {
    private lateinit var binding: FragmentCourseBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCourseBinding.bind(view)
        initAdapter()

    }


    private fun getCourseList(): List<CourseModel> {
        return listOf(
            CourseModel(
                1,
                "Android Development",
                "This course is talk about android",
                R.drawable.image_mobile_application,
                12f,
                16,
                "Free Course"
            ),
            CourseModel(
                2,
                "Web Development",
                "This course is talk about Web",
                R.drawable.image_web_application,
                100f,
                160,
                "Free Course"
            ),
            CourseModel(
                1,
                "Android Development",
                "This course is talk about android",
                R.drawable.image_mobile_application,
                12f,
                16,
                "Free Course"
            ),
            CourseModel(
                2,
                "Web Development",
                "This course is talk about Web",
                R.drawable.image_web_application,
                100f,
                160,
                "Free Course"
            ),
            CourseModel(
                2,
                "Web Development",
                "This course is talk about Web",
                R.drawable.image_web_application,
                100f,
                160,
                "Free Course"
            ),
            CourseModel(
                2,
                "Web Development",
                "This course is talk about Web",
                R.drawable.image_web_application,
                100f,
                160,
                "Free Course"
            )
        )
    }

    private fun initAdapter() {
        val courseAdapter = CourseAdapter(getCourseList()) { item ->
            startActivity(Intent(binding.root.context, CourseDetailActivity::class.java).apply {
                putExtra("title", item.title)
                putExtra("desc", item.desc)
                putExtra("image", item.image.toString())
                putExtra("status", item.status)
                putExtra("duration", item.duration.toString())
            })
        }
        val rcView = binding.rcCourse
        val layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.VERTICAL, false)

        rcView.layoutManager = layoutManager
        rcView.adapter = courseAdapter
    }
}