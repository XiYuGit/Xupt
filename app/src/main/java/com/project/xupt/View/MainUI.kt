package com.project.xupt.View


import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import android.view.View
import com.project.xupt.FragmentAdapter
import com.project.xupt.Fragments.Fragment1
import com.project.xupt.Fragments.Fragment2
import com.project.xupt.Fragments.Fragment3
import com.project.xupt.R
import kotlinx.android.synthetic.main.main_ui.*

/**
 * Created by xiyu0 on 2017/9/21.
 */
class

MainUI: AppCompatActivity(),View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return true

    }

    fun setTitleList(): List<String> {
        val titleList = ArrayList<String>()
        titleList.add("课程表")
        titleList.add("成绩")
        titleList.add("其他")
        return titleList
    }

    fun setFragmentList():List<Fragment>{
        var fragmentList=ArrayList<Fragment>()
        fragmentList.add(Fragment1())
        fragmentList.add(Fragment2())
        fragmentList.add(Fragment3())
        return fragmentList
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_ui)
        var titleList=setTitleList()
        var fragmentList=setFragmentList()
        var fragmentAdpter=FragmentAdapter(supportFragmentManager,titleList,fragmentList)
        viewPager.setAdapter(fragmentAdpter)
        tabLayout.setupWithViewPager(viewPager,true)
        tabLayout.setTabsFromPagerAdapter(fragmentAdpter)
        daohang.setOnClickListener(this)
    }




    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.daohang->{
                    drawerLayout.openDrawer(GravityCompat.START)
                }

            }
        }
    }

}