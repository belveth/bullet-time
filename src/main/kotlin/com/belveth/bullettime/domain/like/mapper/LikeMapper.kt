package com.belveth.bullettime.domain.like.mapper

import com.belveth.bullettime.domain.like.dto.CreateLikeDto
import com.belveth.bullettime.domain.like.entity.LikeEntity
import org.mapstruct.*

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface LikeMapper {
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun toEntityFromDto(createLikeDto: CreateLikeDto): LikeEntity
}
