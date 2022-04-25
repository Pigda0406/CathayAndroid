package com.cathay.banc.contract

import com.martin.exam.github.model.Users


class UserListContract {

    interface IUserPresenter {
        fun getUserList()
        fun getUserDetail(userLogin: String)
    }

    interface IUserListView {
        fun onGetResult(userListItemList: List<Users>?)
    }

    interface IUserDetailCallback {
        fun onGetUserDetail(userDetail: Users?)
    }
}
