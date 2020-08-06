package com.jiahaoliuliu.simplelayouttransitions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ModalBottomSheetFragment : BottomSheetDialogFragment(),
    OnShowFirstModalBottomSheetFragmentRequested, OnShowSecondModalBottomSheetFragmentRequested,
    OnDismissRequested {

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

    override fun showFirstModalBottomSheetFragment(withAnimation: Boolean) {
        val firstModalBottomSheetFragment = FirstModalBottomSheetFragment(this, this)
        val ft = childFragmentManager.beginTransaction()
        if (withAnimation) {
            ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        }
        ft.replace(R.id.modal_bottom_sheet_container, firstModalBottomSheetFragment)
        ft.addToBackStack(tag);
        ft.commit()
    }

    override fun showSecondModalBottomSheetFragment() {
        val secondModalBottomSheetFragment = SecondModalBottomSheetFragment(this)
        val ft = childFragmentManager.beginTransaction()
        ft.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        ft.replace(R.id.modal_bottom_sheet_container, secondModalBottomSheetFragment)
        ft.commit()
    }
}

interface OnShowSecondModalBottomSheetFragmentRequested {
    fun showSecondModalBottomSheetFragment()
}

interface OnShowFirstModalBottomSheetFragmentRequested {
    fun showFirstModalBottomSheetFragment(withAnimation: Boolean = false)
}

interface OnDismissRequested {
    fun dismiss()
}
