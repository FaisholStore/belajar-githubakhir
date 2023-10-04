package com.dicoding.aplikasi_github.API


import com.dicoding.aplikasi_github.Data.Model.DetailUserResponse
import com.dicoding.aplikasi_github.Data.Model.User
import com.dicoding.aplikasi_github.Data.Model.UserResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>
//
//    @GET("users/{username}")
//    @Headers("Authorization: token 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")
//    fun getUserDetail(
//
//        @Path("username") username: String
//    ): Call<DetailUserResponse>
//
//    @GET("users/{username}/followers")
//    @Headers("Authorization: token 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")
//    fun getFollowers(
//        @Path("username") username: String
//    ): Call<ArrayList<User>>
//
//    @GET("users/{username}/following")
//    @Headers("Authorization: token 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")
//    fun getFollowing(
//        @Path("username") username: String
//    ): Call<ArrayList<User>>

}