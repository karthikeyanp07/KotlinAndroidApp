package com.sample.android.domain.repository

import com.sample.android.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository
{
    fun getUsers(): Flow<List<User>>
}