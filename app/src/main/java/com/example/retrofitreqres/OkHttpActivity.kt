package com.example.retrofitreqres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class OkHttpActivity : AppCompatActivity() {

    val URL = "https://reqres.in/api/"
    var okHttpClient: OkHttpClient = OkHttpClient()

    private val TAG = "OkHttpActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ok_http)

        val request = Request.Builder().url(URL).build()

        okHttpClient.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
            }

            override fun onResponse(call: Call, response: Response) {

                if (response.isSuccessful) {

                    val str = response.body?.string()

                    val txt = (JSONObject(str!!).getJSONObject("value").get("joke")).toString()

                    Log.d(TAG, "onResponse: $txt")

                }


            }
        })


    }
}