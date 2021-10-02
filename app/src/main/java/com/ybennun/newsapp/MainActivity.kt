package com.ybennun.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        search_button.setOnClickListener {
            val url = getUrl()

            val queue = Volley.newRequestQueue(this)

            val stringRequest =
                StringRequest(Request.Method.GET, url, { response ->
                    response
                },
                    { error ->
                        error
                    })
            queue.add(stringRequest)
        }
    }

    private fun getUrl(): String {
        val word = search_edit_text.text
        val apiKey = "1a2c32c2-1bb4-458c-b336-c9b827dd9788"
        val pageNumber = 1
        val pageSize = 10

        return "https://content.guardianapis.com/$word?page=$pageNumber&page-size=$pageSize&api-key=$apiKey"
    }
}