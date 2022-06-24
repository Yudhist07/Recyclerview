package com.yudhistira.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yudhistira.recyclerview.adapter.AdapterTeamBola
import com.yudhistira.recyclerview.databinding.ActivityMainBinding
import com.yudhistira.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Gareth Bale",R.drawable.bale,"Center Back", "2.00 m","Jerman","23 Desember 1997"))

        binding.List.adapter = AdapterTeamBola(this,listPemain,object : AdapterTeamBola.OnClickListener {
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })

    }
}