package com.example.blogapp_2.api

import com.example.blogapp_2.models.BlogPost
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BlogApiService {
    @GET("/wp-json/wp/v2/posts")
    suspend fun getPosts(
        @Query("per_page") perPage: Int = 10,
        @Query("page") page: Int = 1
    ): Response<List<BlogPost>>
}
