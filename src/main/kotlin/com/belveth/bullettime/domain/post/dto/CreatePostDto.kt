package com.belveth.bullettime.domain.post.dto

import javax.validation.constraints.NotBlank

data class CreatePostDto(
    @field:NotBlank
    var name: String?,
    @field:NotBlank
    var email: String?,
    @field:NotBlank
    var password: String?,
    var nickname: String?,
)