package com.belveth.bullettime.domain.like.dto

import javax.validation.constraints.NotBlank

data class CreateLikeDto(
    @field:NotBlank
    var targetId: Long,
    @field:NotBlank
    var targetType: String,
    @field:NotBlank
    var userId: String,
)