package com.belveth.bullettime.domain.post.mapper

import com.belveth.bullettime.domain.post.dto.CreatePostDto
import com.belveth.bullettime.domain.post.dto.PostDto
import com.belveth.bullettime.domain.post.entity.PostEntity
import org.mapstruct.BeanMapping
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface PostMapper {
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun dtoFromEntity(postEntity: PostEntity): PostDto

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun toEntityFromDto(createPostDto: CreatePostDto): PostEntity
}
