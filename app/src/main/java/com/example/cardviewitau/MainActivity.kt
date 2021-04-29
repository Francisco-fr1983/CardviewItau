package com.example.cardviewitau


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private var adapter = MenuitemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemsLista()


    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)

    }

    private fun setItemsLista() {
        adapter.setItensList(
            arrayListOf(
                MenuitemModel(
                        "cartões"
                ),
                MenuitemModel(
                        "meus comprovantes"
                ),
                MenuitemModel(
                        "investimentos"
                ),
                MenuitemModel(
                        "portabilidade de salário"
                ),
                MenuitemModel(
                        "poupança"
                ),
                MenuitemModel(
                        "crédito"
                ),
                MenuitemModel(
                        "pagamentos"
                ),
                MenuitemModel(
                        "transferência"
                ),
            )
        )

    }
}