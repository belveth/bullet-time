package com.belveth.bullettime.domain.user.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
@Table(name = "users")
class UserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column(nullable = false)
  var email: String = "",

  @Column(nullable = false)
  var nickname: String = "",

  @Column(nullable = false)
  var password_digest: String = "",

  @Column(columnDefinition = "int default 0")
  var gender: Int = 0,
)
