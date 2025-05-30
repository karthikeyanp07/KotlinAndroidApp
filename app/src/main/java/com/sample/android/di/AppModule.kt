package com.sample.android.di

import com.sample.android.data.api.MyApi
import com.sample.android.data.repository.UserRepositoryImpl
import com.sample.android.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule
{
    @Provides
    fun provideBaseUrl() = "https://api.github.com/"

    @Provides
    @Singleton
    fun provideApi(baseUrl: String): MyApi =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)

    @Provides
    @Singleton
    fun provideUserRepository(api: MyApi): UserRepository =
        UserRepositoryImpl(api)
}