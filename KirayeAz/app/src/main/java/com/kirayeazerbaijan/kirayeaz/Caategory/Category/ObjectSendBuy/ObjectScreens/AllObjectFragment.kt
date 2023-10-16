package com.kirayeazerbaijan.kirayeaz.Caategory.Category.ObjectSendBuy.ObjectScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kirayeazerbaijan.kirayeaz.AllAdapter
import com.kirayeazerbaijan.kirayeaz.AllData
import com.kirayeazerbaijan.kirayeaz.R
import com.kirayeazerbaijan.kirayeaz.databinding.FragmentAllObjectBinding


class AllObjectFragment : Fragment() {
    lateinit var binding: FragmentAllObjectBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AllAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllObjectBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRc()
    }

    private fun initRc() {
        adapter = AllAdapter(requireContext())
        recyclerView = binding.rc
        recyclerView.adapter = adapter

        val fakeDataList = listOf(
            AllData("Xacm", 100, "Nurlan",R.drawable.kiraye1),
            AllData("asas", 1200, "Android",R.drawable.buy),

            )

        adapter.setData(fakeDataList)
    }


}