package kh.edu.rupp.ite.ea.huychoung.e_coding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ActivityMainBinding
import kh.edu.rupp.ite.ea.huychoung.e_coding.ui.fragments.CourseFragment
import kh.edu.rupp.ite.ea.huychoung.e_coding.ui.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()
        bottomNav()
    }
    private fun initComponents() {

    }

    private fun bottomNav() {
        val homeFragment = HomeFragment()
        setFragment(homeFragment)
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.homeMenu -> {
                    // set home fragment.
                    setFragment(homeFragment)
                }
                R.id.courseMenu -> {
                    // set course fragment.
                    setFragment(CourseFragment())
                }
                R.id.messageMenu -> {
                    // set message fragment.
                }
                R.id.accountMenu -> {
                    // set account fragment.
                }
            }

            return@setOnItemSelectedListener true
        }
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commitNow()
        }
    }
}