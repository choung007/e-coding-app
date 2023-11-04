package kh.edu.rupp.ite.ea.huychoung.e_coding.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.ea.huychoung.e_coding.R
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.FragmentCourseBinding

class CourseFragment : Fragment(R.layout.fragment_course) {
    private lateinit var binding: FragmentCourseBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCourseBinding.bind(view)


    }
}