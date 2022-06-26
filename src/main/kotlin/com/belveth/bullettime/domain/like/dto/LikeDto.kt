package com.belveth.bullettime.domain.like.dto

data class LikeDto(
    val targetType: String,
    val targetId: Long,
    val userId: Long,
)
