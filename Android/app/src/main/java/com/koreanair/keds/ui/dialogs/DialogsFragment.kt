package com.koreanair.keds.ui.dialogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.koreanair.keds.databinding.FragmentDialogsBinding

class DialogsFragment : Fragment() {
    private var _binding: FragmentDialogsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel =
            ViewModelProvider(this).get(DialogsViewModel::class.java)

        _binding = FragmentDialogsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        _binding?.btnBasicAlertDialog?.setOnClickListener {
            val dialog = BasicAlertDialogFragment().getInstance()

            fragmentManager?.let {
                dialog.setTargetFragment(this@DialogsFragment, 100)
                dialog.show(it, "")
            }
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}