package com.project.xupt.View


import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
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

    fun  initFragment():Boolean{
        var fragmentList=ArrayList<Fragment>()
        fragmentList.add(Fragment1())
        fragmentList.add(Fragment2())
        fragmentList.add(Fragment3())
        var fragmentAdpter=FragmentAdapter(supportFragmentManager,fragmentList)
        viewPager.setAdapter(fragmentAdpter)
        //设置是否开启ViewPager滑动

       return true
    }

    fun initTab():Boolean{
        tabLayout.setupWithViewPager(viewPager,true)
        tabLayout.setTabMode(TabLayout.MODE_FIXED)
        tabLayout.getTabAt(0)?.setText("课程表")?.setIcon(R.drawable.pic_classes)
        tabLayout.getTabAt(1)?.setText("成绩")?.setIcon(R.drawable.pic_score)
        tabLayout.getTabAt(2)?.setText("更多")?.setIcon(R.drawable.pic_more)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_ui)
        initFragment()
        initTab()
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