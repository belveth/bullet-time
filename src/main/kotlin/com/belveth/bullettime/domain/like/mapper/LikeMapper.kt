package com.belveth.bullettime.domain.like.mapper

import com.belveth.bullettime.domain.like.dto.CreateLikeDto
import com.belveth.bullettime.domain.like.dto.LikeDto
import com.belveth.bullettime.domain.like.entity.LikeEntity
import org.mapstruct.BeanMapping
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface LikeMapper {
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun dtoFromEntity(likeEntity: LikeEntity): LikeDto

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun toEntityFromDto(createLikeDto: CreateLikeDto): LikeEntity
}
