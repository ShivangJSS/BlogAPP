package com.example.blogapp_2.models

import com.google.gson.annotations.SerializedName

data class BlogPost(
    val id: Int,
    val title: Title,
    @SerializedName("link") val url: String // URL to full blog post
)

data class Title(
    @SerializedName("rendered") val rendered: String
)
