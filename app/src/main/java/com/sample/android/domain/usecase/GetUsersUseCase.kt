package com.sample.android.domain.usecase

import com.sample.android.domain.model.User
import com.sample.android.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(private val repository: UserRepository)
{
    operator fun invoke(): Flow<List<User>> = repository.getUsers()
}