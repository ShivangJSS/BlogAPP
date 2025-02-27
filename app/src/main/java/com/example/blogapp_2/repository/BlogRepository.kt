package com.example.blogapp_2.repository

import com.example.blogapp_2.api.BlogApiService
import com.example.blogapp_2.models.BlogPost
import javax.inject.Inject

class BlogRepository @Inject constructor(private val api: BlogApiService) {
    suspend fun getBlogPosts(): List<BlogPost>? {
        val response = api.getPosts()
        return if (response.isSuccessful) response.body() else null
    }
}
