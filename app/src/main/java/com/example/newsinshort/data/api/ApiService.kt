package com.example.newsinshort.data.api

import com.example.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country")country:String,
        @Query("apiKey")apiKey: String = "e9ff6845f866431f9d6ada8f3e723eb8"
    ): Response<NewsResponse>

}

//https://newsapi.org/v2/top-headlines?country=us&apiKey=e9ff6845f866431f9d6ada8f3e723eb8