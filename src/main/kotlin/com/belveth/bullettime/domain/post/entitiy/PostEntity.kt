package com.belveth.bullettime.domain.post.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.math.BigInteger
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "posts",
        indexes = [
          Index(columnList = "nickname", unique = true),
          Index(columnList = "email", unique = true)
        ])
class PostEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column(nullable = false)
  var email: String = "",

  @Column(nullable = false)
  var name: String = "",

  @Column(nullable = false)
  var nickname: String = "",

  @Column(nullable = false)
  var password_digest: String = "",

  @Column(columnDefinition = "int default 0")
  var gender: Int = 0,

  @Lob
  @Column()
  var body: String,

  //TODO - reference to Location
  @Column()
  var location_id: BigInteger,

  @Column(columnDefinition = "int default 0")
  var location_range: Int = 0,

  @Column()
  var image: String = "",

  @Column()
  var uid: String = "",

  @Column()
  var provider: String = "",

  @Column()
  var user_type: String = "",

  @Column()
  var account_type: String = "normal",

  @Column()
  var devise_type: String = "normal",

  @Column()
  var birthday: String = "",

  @Column()
  var number: String = "",

  @Column()
  var likes_count: Int = 0,

  @Column()
  var reports_count: Int = 0,

  @Column()
  var reviews_count: Int = 0,

  @Column()
  var expire_at: Date,

  @CreationTimestamp
  var created_at: Date,

  @UpdateTimestamp
  var updated_at: Date,
)
