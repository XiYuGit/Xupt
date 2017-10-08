package com.project.xupt

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by xiyu0 on 2017/9/25.
 */
class FragmentAdapter(fm: FragmentManager?, titleList:List<String>, fragmentList: List<Fragment>) : FragmentPagerAdapter(fm) {
    val listTitle:List<String>
    val listFragment:List<Fragment>
    init {
        listTitle=titleList
        listFragment=fragmentList
    }


    override fun getItem(position: Int): Fragment {
        return listFragment.get(position)
    }

    override fun getCount(): Int {
        return listFragment.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return listTitle.get(position)
    }

}