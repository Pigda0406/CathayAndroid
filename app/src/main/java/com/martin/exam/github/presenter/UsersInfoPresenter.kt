package com.martin.exam.github.presenter

import androidx.lifecycle.ViewModel
import com.martin.exam.github.model.UserInfoRepository
import com.martin.exam.github.model.Users
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UsersInfoPresenter @Inject constructor(private val repository: UserInfoRepository) {

    fun getUserInfo(id: String): Flow<Users?> {
        return repository.getUserInfo(id)
    }

}