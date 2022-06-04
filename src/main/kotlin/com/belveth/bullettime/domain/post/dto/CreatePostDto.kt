package com.belveth.bullettime.domain.post.dto

import javax.validation.constraints.NotBlank

data class CreatePostDto(
    @field:NotBlank var title: String?,
    var body: String?,
    var product: String?,
    var price: Long?,
    var category_id: Long?,
    var image: String?,
    var post_type: String?,
    var contract: String?,
)
