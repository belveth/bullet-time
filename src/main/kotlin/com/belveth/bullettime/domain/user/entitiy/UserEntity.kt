package com.belveth.bullettime.domain.user.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class UserEntity(
  @Id
  @Column(name = "id")
  var id: String = "",

  @Column(name = "email", nullable = false)
  var email: String = ""

  @Column(name = "nickname")
  var nickname: String = ""

  @Column(name = "password_digest")
  var email: String = ""

  @Column(name = "gender", columnDefinition = "int default 0")
  var gender: Int = 0,
)
