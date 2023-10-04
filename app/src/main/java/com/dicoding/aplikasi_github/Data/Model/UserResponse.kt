package com.dicoding.aplikasi_github.Data.Model

data class UserResponse(
    val total_count: Int,
    val incomplete_results: Boolean,
    val items : ArrayList<User>

)