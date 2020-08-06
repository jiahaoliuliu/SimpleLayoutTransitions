package com.jiahaoliuliu.simplelayouttransitions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ModalBottomSheetFragment : BottomSheetDialogFragment(), OnShowFirstModalBottomSheetFragmentRequested, OnShowSecondModalBottomSheetFragmentRequested {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_modal_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFirstModalBottomSheetFragment()
    }

    override fun showFirstModalBottomSheetFragment() {
        val firstModalBottomSheetFragment = FirstModalBottomSheetFragment(this)
        val ft = childFragmentManager.beginTransaction()
        ft.replace(R.id.modal_bottom_sheet_container, firstModalBottomSheetFragment)
        ft.commit()
    }

    override fun showSecondModalBottomSheetFragment() {
        val secondModalBottomSheetFragment = SecondModalBottomSheetFragment(this)
        val ft = childFragmentManager.beginTransaction()
        ft.replace(R.id.modal_bottom_sheet_container, secondModalBottomSheetFragment)
        ft.commit()
    }
}

interface OnShowSecondModalBottomSheetFragmentRequested {
    fun showSecondModalBottomSheetFragment()
}

interface OnShowFirstModalBottomSheetFragmentRequested {
    fun showFirstModalBottomSheetFragment()
}
