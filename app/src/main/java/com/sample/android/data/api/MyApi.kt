package com.sample.android.data.api

import com.sample.android.data.model.UserDto
import retrofit2.http.GET

interface MyApi
{
    @GET("users")
    suspend fun getUsers(): List<UserDto>
}