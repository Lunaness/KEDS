package com.koreanair.keds.ui.lists

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.koreanair.keds.R
import com.koreanair.keds.databinding.FragmentButtonsBinding
import com.koreanair.keds.databinding.FragmentListsBinding

class ListsFragment : Fragment() {
    private var _binding: FragmentListsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel =
            ViewModelProvider(this).get(ListsViewModel::class.java)

        _binding = FragmentListsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textLists
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}