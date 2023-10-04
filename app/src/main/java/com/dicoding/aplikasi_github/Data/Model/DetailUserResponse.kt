package com.dicoding.aplikasi_github.Data.Model


data class DetailUserResponse(

    val login: String,
    val id: Long,
    val avatar_url: String,
    val name: String,
    val followers_url: String,
    val following_url: String,
    val followers: Int,
    val following: Int,

    )