package com.kodingwithkyle.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var mCount = 0
    lateinit var mShowCountTV : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCountTV = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        ++mCount
        mShowCountTV.text = mCount.toString()
    }
}
