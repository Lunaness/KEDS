package com.koreanair.keds.ui.dialogs

import android.graphics.Canvas
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EdgeEffect
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.koreanair.keds.R
import com.koreanair.keds.databinding.FragmentBasicAlertDialogBinding


class BasicAlertDialogFragment: DialogFragment() {

    override fun onResume() {
        super.onResume()
        dialog?.window?.setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater.inflate(R.layout.fragment_basic_alert_dialog, container, false)
        val binding = FragmentBasicAlertDialogBinding.bind(view)

        binding.btnClose.setOnClickListener { dismiss() }
        binding.btnCancel.setOnClickListener { dismiss() }
        binding.btnOk.setOnClickListener { dismiss() }


        return view
    }

    fun getInstance(): BasicAlertDialogFragment {
        return BasicAlertDialogFragment()
    }



}