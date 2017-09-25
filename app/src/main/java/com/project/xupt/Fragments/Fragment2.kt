package com.project.xupt.Fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by xiyu0 on 2017/9/25.
 */
class Fragment2: Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view =inflater.inflate(R.layout.fragMent2)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}