package com.sample.android.data.repository

import com.sample.android.data.api.MyApi
import com.sample.android.domain.model.User
import com.sample.android.domain.model.toDomain
import com.sample.android.domain.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val api: MyApi) : UserRepository
{
    override fun getUsers(): Flow<List<User>> = flow {
        val users = api.getUsers().map { it.toDomain() }
        emit(users)
    }.flowOn(Dispatchers.IO)
}