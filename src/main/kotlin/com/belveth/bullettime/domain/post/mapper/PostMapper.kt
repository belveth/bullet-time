package com.belveth.bullettime.domain.post.mapper

import com.belveth.bullettime.domain.post.dto.CreatePostDto
import com.belveth.bullettime.domain.post.dto.PostDto
import com.belveth.bullettime.domain.post.dto.UpdatePostDto
import com.belveth.bullettime.domain.post.entity.PostEntity
import org.mapstruct.*

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface PostMapper {
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun dtoFromEntity(postEntity: PostEntity): PostDto

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun toEntityFromDto(createPostDto: CreatePostDto): PostEntity

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun updateEntityFromDto(updatePostDto: UpdatePostDto, @MappingTarget postEntity: PostEntity): PostEntity
}
