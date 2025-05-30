package com.sample.android.domain.model
import com.sample.android.data.model.UserDto

data class User(
    val username: String,
    val id: Int,
    val avatarUrl: String
)

fun UserDto.toDomain(): User {
    return User(username = login, id = id, avatarUrl = avatar_url)
}