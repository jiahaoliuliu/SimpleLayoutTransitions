package com.jiahaoliuliu.simplelayouttransitions

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class FirstModalBottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_modal_bottom_sheet, container, false)
        view.findViewById<Button>(R.id.show_second_modal_bottom_sheet).setOnClickListener {
            showSecondModalBottomSheet()
        }
        return view
    }

    private fun showSecondModalBottomSheet() {
        val secondModalBottomSheetFragment = SecondModalBottomSheetFragment()
        secondModalBottomSheetFragment.show(activity!!.supportFragmentManager, secondModalBottomSheetFragment.tag)
    }
}