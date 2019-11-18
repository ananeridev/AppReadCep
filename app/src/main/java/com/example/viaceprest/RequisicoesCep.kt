package com.example.viaceprest

import feign.Param
import feign.RequestLine

interface RequisicoesCep {

    @RequestLine("GET /posts/{id}")
    fun getCep(@Param("id") id: Int): Consulta?
}