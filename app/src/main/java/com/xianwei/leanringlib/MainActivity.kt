package com.xianwei.leanringlib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xianwei.leanringlib.lib_android.animation.AnimationTestActivity
import com.xianwei.leanringlib.lib_android.customview.CustomeViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animation_button.setOnClickListener {
            startActivity(Intent(this, AnimationTestActivity::class.java))
        }

        custom_view_button.setOnClickListener {
            startActivity(Intent(this, CustomeViewActivity::class.java))
        }
    }
}
