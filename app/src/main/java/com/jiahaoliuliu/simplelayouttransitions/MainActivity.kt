package com.jiahaoliuliu.simplelayouttransitions

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        showFullScreenBottomSheet()
    }

    private fun showFullScreenBottomSheet() {
        val fragment = FullScreenBottomSheetFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment,
            FullScreenBottomSheetFragment::class.java.name)
        transaction.commit()
    }
}