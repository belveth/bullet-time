package com.belveth.bullettime.domain.user.entity

import com.sun.istack.NotNull
import org.hibernate.annotations.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import java.math.BigInteger
import java.util.*
import javax.persistence.*
import javax.persistence.Index

@Entity
@Table(name = "users",
        indexes = [
          Index(columnList = "nickname", unique = true),
          Index(columnList = "email", unique = true)
        ])
@DynamicInsert
@DynamicUpdate
class UserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long,

  @Column()
  @NotNull()
  var email: String,

  @Column()
  @NotNull()
  var name: String,

  @Column()
  @NotNull()
  var nickname: String,

  @Column(name="password_digest")
  @NotNull()
  var passwordDigest: String,

  @Column(columnDefinition = "int default 0")
  @ColumnDefault("0")
  var gender: Int?,

  @Lob
  @Column()
  var body: String?,

  //TODO - reference to Location
//  @Column(name="location_id")
//  var locationId: BigInteger?,
//
//  @Column(name="location_range")
//  @ColumnDefault("0")
//  var locationRange: Int,

  @Column()
  var image: String?,

  @Column()
  var uid: String?,

  @Column()
  var provider: String?,

  @Column(name="user_type")
  @ColumnDefault("0")
  var userType: Int?,

  @Column(name="account_type")
  @ColumnDefault("'normal'")
  var accountType: String?,

  @Column(name="devise_type")
  @ColumnDefault("'normal'")
  var deviseType: String?,

  @Column()
  var birthday: String?,

  @Column()
  var number: String?,

  @Column(name="likes_count")
  @ColumnDefault("0")
  var likes_count: Int?,

  @Column(name="reports_count")
  @ColumnDefault("0")
  var reportsCount: Int?,

  @Column(name="reviews_count")
  @ColumnDefault("0")
  var reviews_count: Int?,

  @Column()
  var expire_at: Date?,

  @Column(name="created_at")
  @CreationTimestamp
  var createdAt: Date?,

  @Column(name="updated_at")
  @UpdateTimestamp
  var updatedAt: Date?,
)
