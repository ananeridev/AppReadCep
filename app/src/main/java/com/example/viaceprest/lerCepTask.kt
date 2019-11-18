package com.example.viaceprest

import android.os.AsyncTask
import feign.Feign
import feign.gson.GsonDecoder

class lerCepTask :AsyncTask<Int, Void, Consulta>() {
    override fun doInBackground(vararg params: Int?): Consulta? {
        val request = Feign.builder()
            .decoder(GsonDecoder())
            .target(
                RequisicoesCep::class.java,
                "https://viacep.com.br/ws/<CEP>/json/"
            )
        try {
            return request.getCep(params[0]!!)
        } catch (e: Exception) {
            return null
        }
    }
}