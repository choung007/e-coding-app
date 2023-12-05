package kh.edu.rupp.ite.ea.huychoung.e_coding.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kh.edu.rupp.ite.ea.huychoung.e_coding.R
import kh.edu.rupp.ite.ea.huychoung.e_coding.adapters.CourseDetailAdapter
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ActivityCourseDetailBinding
import kh.edu.rupp.ite.ea.huychoung.e_coding.models.CourseDetailModel

class CourseDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCourseDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCourseDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        initCourseAdapter()
    }

    private fun getCourseDetailList(): List<CourseDetailModel> {
        return listOf(
            CourseDetailModel(
                1,
                "HTML",
                R.drawable.image_mobile_application,
                10f,
                "This is HTML course."
            ),
            CourseDetailModel(
                1,
                "CSS",
                R.drawable.image_mobile_application,
                10f,
                "This is CSS course."
            ),
            CourseDetailModel(
                1,
                "JavaScript",
                R.drawable.image_mobile_application,
                10f,
                "This is JavaScript course."
            )
        )
    }

    private fun initCourseAdapter() {
        val adapter = CourseDetailAdapter(getCourseDetailList())
        val rcView = binding.rcCourseDetail
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // assign adapter
        rcView.layoutManager = layoutManager
        rcView.adapter = adapter
    }
}