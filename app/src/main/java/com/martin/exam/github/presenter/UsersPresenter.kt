package com.martin.exam.github.presenter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.martin.exam.github.model.Users
import com.martin.exam.github.model.UsersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UsersPresenter @Inject constructor(private val repository: UsersRepository){

    private var currentUsersResult: Flow<PagingData<Users>>? = null

    fun gerUsers(): Flow<PagingData<Users>> {
        val result: Flow<PagingData<Users>> = repository.getUser()
        currentUsersResult = result
        return result
    }
}