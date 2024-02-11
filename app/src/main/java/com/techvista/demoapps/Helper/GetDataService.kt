package com.techvista.demoapps.Helper


import com.google.gson.JsonObject
import retrofit2.Call

import retrofit2.http.*

interface GetDataService {

    @GET("products")
    fun products(
    ): Call<JsonObject>

}

