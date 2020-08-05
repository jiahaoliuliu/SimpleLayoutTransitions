package com.jiahaoliuliu.simplelayouttransitions

import android.os.Bundle
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