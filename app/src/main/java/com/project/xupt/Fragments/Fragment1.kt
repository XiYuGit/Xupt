package com.project.xupt.Fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_1classes.*

/**
 * Created by xiyu0 on 2017/9/25.
 */
class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view =inflater.inflate(fragMent1,false
        )
        return view
    }
}