package com.belveth.bullettime.domain.user.mapper

import com.belveth.bullettime.domain.user.dto.CreateUserDto
import com.belveth.bullettime.domain.user.dto.UserDto
import com.belveth.bullettime.domain.user.entity.UserEntity
import org.mapstruct.BeanMapping
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface UserMapper {
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun dtoFromEntity(userEntity: UserEntity): UserDto

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun toEntityFromDto(createUserDto: CreateUserDto): UserEntity
}
