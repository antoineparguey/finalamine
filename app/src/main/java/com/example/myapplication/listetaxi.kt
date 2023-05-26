package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adaptater.ItemAdapter
import com.example.myapplication.datasouce.DataSourceTaxi


class listetaxi : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_listetaxi, container, false)

        val button = view.findViewById<Button>(R.id.buttondisconnect)
        val buttonhisto = view.findViewById<Button>(R.id.buttonhistoric)

        val myDataset = DataSourceTaxi().loadAffirmations()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

        buttonhisto.setOnClickListener {

                view ->
            view.findNavController().navigate(R.id.action_listetaxi_to_historic)

        }
        button.setOnClickListener {

                view ->
            view.findNavController().navigate(R.id.action_listetaxi_to_creationprofile)

        }
        return view
    }


}