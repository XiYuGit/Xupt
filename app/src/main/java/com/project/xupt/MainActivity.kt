package com.project.xupt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.project.xupt.View.MainUI

class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)
        var textView:TextView
        textView= findViewById(R.id.denglu) as TextView
        textView.setOnClickListener {
            var intent=Intent()
            intent.setClass(this, MainUI::class.java)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {

    }
}
