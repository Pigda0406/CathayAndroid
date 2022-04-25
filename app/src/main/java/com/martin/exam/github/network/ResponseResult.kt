package com.martin.exam.github.network

sealed class ResponseResult

data class ResponseSuccess<T>(val data: T?) : ResponseResult()
data class ResponseError(val t: Throwable?) : ResponseResult()