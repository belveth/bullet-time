package com.belveth.bullettime.domain.post.dto

data class PostDto(
    val id: Long?,
    var body: String?,
    var product: String?,
    var price: Long?,
    var post_type: String?,
    var category_id: Long?,
    var image: String?,
    var contract: String?,
    var status: Int?,
)
