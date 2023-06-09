package com.example.introductionretrofit.retrofit

import com.example.retrofitreqres.models.createUser.ReqUser
import com.example.retrofitreqres.models.createUser.ResUser
import com.example.retrofitreqres.models.listUser.UserResponce
import com.example.retrofitreqres.models.singleUser.SingleUserResponce
import com.example.retrofitreqres.models.updateUser.ResUpdateUSer
import kotlinx.coroutines.Delay
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query


interface RetrofitService {


    @GET("users")
    fun getUsers(): Call<UserResponce>

    @GET("users/{id}")
    fun getSingleUser(@Path("id") id: Int): Call<SingleUserResponce>

    @POST("users")
    fun createUser(@Body reqUser: ReqUser): Call<ResUser>

    @PUT("users/{id}")
    fun updateUser(@Path("id") id: Int, @Body reqUser: ReqUser): Call<ResUpdateUSer>

    @DELETE("user/{id}")
    fun deleteUser(@Path("id") id: Int): Call<ResponseBody>

    @GET("users")
    fun getUsersDelay(@Query("delay") delay: Int): Call<UserResponce>

}