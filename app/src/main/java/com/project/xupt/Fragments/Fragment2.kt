package com.project.xupt.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.xupt.R
import kotlinx.android.synthetic.main.fragment2.*

/**
 * Created by xiyu0 on 2017/9/25.
 */
class Fragment2: Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view = inflater!!.inflate(R.layout.fragment2,container,false)
        return view
    }
}