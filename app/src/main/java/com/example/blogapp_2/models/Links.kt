package com.example.blogapp_2.models

data class Links(
    val about: List<About>,
    val author: List<Author>,
    val collection: List<Collection>,
    val curies: List<Cury>,
    val predecessorVersion: List<PredecessorVersion>,
    val replies: List<Reply>,
    val self: List<Self>,
    val versionHistory: List<VersionHistory>,
    val wpattachment: List<WpAttachment>,
    val wpfeaturedmedia: List<WpFeaturedmedia>,
    val wpterm: List<WpTerm>
)