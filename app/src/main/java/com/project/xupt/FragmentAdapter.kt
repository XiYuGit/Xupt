package com.project.xupt

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by xiyu0 on 2017/9/25.
 */
class FragmentAdapter(fm: FragmentManager?, fragmentList: List<Fragment>) : FragmentPagerAdapter(fm) {
    val listFragment:List<Fragment>
    init {
        listFragment=fragmentList
    }


    override fun getItem(position: Int): Fragment {
        return listFragment.get(position)
    }

    override fun getCount(): Int {
        return listFragment.size
    }
}