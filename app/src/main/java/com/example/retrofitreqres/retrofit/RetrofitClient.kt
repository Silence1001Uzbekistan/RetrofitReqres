package com.example.introductionretrofit.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {


    fun getRetrofit(baseUrl: String): Retrofit {


        val build = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl).build()

        return build

    }

}