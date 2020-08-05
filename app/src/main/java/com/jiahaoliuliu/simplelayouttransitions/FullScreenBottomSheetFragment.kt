package com.jiahaoliuliu.simplelayouttransitions

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FullScreenBottomSheetFragment : Fragment() {

    lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_full_screen_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpBottomSheet()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setUpBottomSheet() {
        bottomSheetBehavior = BottomSheetBehavior.from(requireActivity().findViewById(R.id.floating_ice_remote_main_layout))
        bottomSheetBehavior.setBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(view: View, slideOffset: Float) {
                // Not do anything
            }

            override fun onStateChanged(view: View, newState: Int) {
                if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
                    // Collapsed
                    Log.v("State", "It is collapsed")
                } else if (newState == BottomSheetBehavior.STATE_EXPANDED) {
                    // Expanded
                    Log.v("State", "It is expanded")
                }
            }
        })
    }
}