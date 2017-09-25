package com.project.xupt.View

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import com.project.xupt.R
import kotlinx.android.synthetic.main.main_ui.*

/**
 * Created by xiyu0 on 2017/9/21.
 */
class MainUI: AppCompatActivity(),View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return true
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_ui)
        var viewList=ArrayList<View>()
        viewList.add(layoutInflater.inflate(R.layout.fragment_1classes,null))
        tabLayout.setTabMode(TabLayout.MODE_FIXED)
        tabLayout.addTab(tabLayout.newTab().setText("aaa").setIcon(R.anim.abc_fade_in))
    }
    override fun onClick(v: View?) {

    }

}