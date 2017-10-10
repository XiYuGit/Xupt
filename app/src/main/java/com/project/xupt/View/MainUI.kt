package com.project.xupt.View

import android.app.ActionBar
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Gravity
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
        var actionBar=getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setHomeAsUpIndicator(R.drawable.daohang)
        Log.e("ttttt",actionBar.toString())
        var titleList=setTitleList()
        var fragmentList=setFragmentList()
        var fragmentAdpter=FragmentAdapter(supportFragmentManager,titleList,fragmentList)
        viewPager.setAdapter(fragmentAdpter)
        tabLayout.setupWithViewPager(viewPager,true)
        tabLayout.setTabsFromPagerAdapter(fragmentAdpter)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){

            R.id.home ->{Log.e("ttttt","ttttt")
                drawerLayout.openDrawer(GravityCompat.START)}
        }

        return true
    }

    override fun onClick(v: View?) {

    }

}