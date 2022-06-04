package com.belveth.bullettime.domain.user.dto

import javax.validation.constraints.NotBlank

data class CreateUserDto(
    @field:NotBlank
    var name: String,
    @field:NotBlank
    var email: String,
    @field:NotBlank
    var nickname: String,
    @field:NotBlank
    var password: String,
)