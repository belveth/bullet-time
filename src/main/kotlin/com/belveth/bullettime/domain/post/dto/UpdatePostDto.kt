package com.belveth.bullettime.domain.post.dto

data class UpdatePostDto(
    var title: String?,
    var body: String?,
    var product: String?,
    var price: Long?,
    var category_id: Long?,
    var image: String?,
    var post_type: String?,
    var contract: String?,
)