package com.example.viaceprest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pesquisar(v:View) {
        val id = editId.getText().toString().toInt()

        val task = lerCepTask()
        //val consulta = Consulta? = task.execute(id).get()



    }
}
