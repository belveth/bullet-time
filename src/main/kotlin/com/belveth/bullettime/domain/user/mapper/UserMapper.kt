package com.belveth.bullettime.domain.user.mapper

import com.belveth.bullettime.domain.user.dto.CreateUserDto
import com.belveth.bullettime.domain.user.dto.UserDto
import com.belveth.bullettime.domain.user.entity.UserEntity
import org.mapstruct.*

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface UserMapper {
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  fun dtoFromEntity(userEntity: UserEntity): UserDto

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(source = "password", target = "passwordDigest")
  fun toEntityFromDto(createUserDto: CreateUserDto): UserEntity
}
