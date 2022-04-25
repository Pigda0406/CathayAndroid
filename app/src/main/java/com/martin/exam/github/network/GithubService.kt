package com.martin.exam.github.network

import com.martin.exam.github.model.Users
import retrofit2.Response
import retrofit2.http.*

interface GithubService {

    @GET("/users")
    @Headers("Accept: application/json")
    suspend fun getUsers(): Response<List<Users>>

    @GET("/users/{id}")
    suspend fun getUserInfo(@Path("id") id: String): Response<Users>

}