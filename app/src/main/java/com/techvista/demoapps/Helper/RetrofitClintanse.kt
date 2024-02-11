package com.techvista.demoapps.Helper

import android.annotation.SuppressLint
import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
@SuppressLint("StaticFieldLeak")
object RetrofitClintanse {
    lateinit var context: Context


    val baseUrl = "https://dummyjson.com/"


    private var retrofit: Retrofit? = null

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


//    fun getClientHeader(): Retrofit? {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level = HttpLoggingInterceptor.Level.BODY
//        val client = OkHttpClient.Builder()
//            .readTimeout(60, TimeUnit.SECONDS)
//            .connectTimeout(60, TimeUnit.SECONDS)
//            .addInterceptor(interceptor)
//            .addInterceptor { chain ->
//                val request = chain.request().newBuilder()
//                    .addHeader("X-API-KEY", token)
//                    .build()
//                chain.proceed(request)
//            }.build()
//        if (retrofit == null || token != null) {
//            retrofit = Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//        }
//        return retrofit
//    }

//    fun getClient(): Retrofit? {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level = HttpLoggingInterceptor.Level.BODY
//        val client = OkHttpClient.Builder()
//            .readTimeout(60, TimeUnit.SECONDS)
//            .connectTimeout(60, TimeUnit.SECONDS)
//            .addInterceptor(interceptor)
//            .addInterceptor { chain ->
//                val request = chain.request().newBuilder()
//                    .addHeader("X-API-KEY", token)
//                    .addHeader("token", Constract.tokens)
//
//                    .build()
//                chain.proceed(request)
//            }.build()
//        if (retrofit == null || token != null) {
//            retrofit = Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//        }
//        return retrofit
//    }

}