package com.belveth.bullettime.domain.user.dto

data class UpdateUserDto(
    var name: String?,
    var email: String?,
    var nickname: String?,
    var password: String?
)