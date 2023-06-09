package com.example.retrofitreqres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.introductionretrofit.retrofit.Common
import com.example.introductionretrofit.retrofit.RetrofitService
import com.example.retrofitreqres.databinding.ActivityMainBinding
import com.example.retrofitreqres.models.createUser.ReqUser
import com.example.retrofitreqres.models.createUser.ResUser
import com.example.retrofitreqres.models.singleUser.SingleUserResponce
import com.example.retrofitreqres.models.updateUser.ResUpdateUSer
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var retrofitService: RetrofitService

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        retrofitService = Common.retrofitService

        //list users
/*        retrofitService.getUsers().enqueue(object :Callback<UserResponce>{
            override fun onResponse(call: Call<UserResponce>, response: Response<UserResponce>) {

                if (response.isSuccessful){

                    Log.d(TAG, "onResponse: ${response.body()}")
                    //response.body()?.data

                }

            }

            override fun onFailure(call: Call<UserResponce>, t: Throwable) {



            }

        })*/


        //Single User
/*        retrofitService.getSingleUser(2).enqueue(object : Callback<SingleUserResponce> {
            override fun onResponse(
                call: Call<SingleUserResponce>,
                response: Response<SingleUserResponce>
            ) {

                if (response.isSuccessful) {

                    Log.d(TAG, "onResponse: ${response.body()?.data}")

                }

            }

            override fun onFailure(call: Call<SingleUserResponce>, t: Throwable) {


            }

        })*/


        //create User
/*
        val reqUser = ReqUser("Developer", "Doniyor")

        retrofitService.createUser(reqUser).enqueue(object :Callback<ResUser>{
            override fun onResponse(call: Call<ResUser>, response: Response<ResUser>) {

                if(response.isSuccessful){

                    Log.d(TAG, "onResponse: ${response.body()}")

                }

            }

            override fun onFailure(call: Call<ResUser>, t: Throwable) {



            }

        })*/

//updateUser
/*        val reqUser = ReqUser("Developer", "Doniyor")
        retrofitService.updateUser(2, reqUser).enqueue(object : Callback<ResUpdateUSer> {
            override fun onResponse(call: Call<ResUpdateUSer>, response: Response<ResUpdateUSer>) {

                if (response.isSuccessful) {
                    Log.d(TAG, "onResponse: ${response.body()}")
                }

            }

            override fun onFailure(call: Call<ResUpdateUSer>, t: Throwable) {


            }

        })*/

        //delete User
        /*retrofitService.deleteUser(1).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {

                if (response.isSuccessful) {

                    Log.d(TAG, "onResponse: ${response.code()}")

                }

            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {


            }

        })*/



    }
}