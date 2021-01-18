package com.ludira.GithubApp.api

import com.ludira.GithubApp.data.model.DetailUserResponse
import com.ludira.GithubApp.data.model.User
import com.ludira.GithubApp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 22f25432b2b515014c20b67a0ddc5567db3b83ed")
    fun getSearchUsers(
        @Query ("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 22f25432b2b515014c20b67a0ddc5567db3b83ed")
    fun getUserDetail(
            @Path ("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 22f25432b2b515014c20b67a0ddc5567db3b83ed")
    fun getFollowers(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 22f25432b2b515014c20b67a0ddc5567db3b83ed")
    fun getFollowing(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

}