package com.martin.exam.github.di

import com.martin.exam.github.network.GithubService
import com.martin.exam.github.network.HttpLogInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun okhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLogInterceptor())
            .build()
    }

    @Provides
    fun retrofitGithub(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun githubService(retrofit: Retrofit): GithubService {
        return retrofit.create(GithubService::class.java)
    }
}