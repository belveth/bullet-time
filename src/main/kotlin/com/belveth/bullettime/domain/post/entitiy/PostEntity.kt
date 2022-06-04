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
          Index(columnList = "category_id"),
          Index(columnList = "location_id"),
          Index(columnList = "user_id")
        ])
class PostEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column()
  var title: String = "",

  @Lob
  @Column()
  var body: String,

  @Column()
  var status: Int,

  @Column()
  var rent_count: Int,

  @Column()
  var like_count: Int,

  @Column()
  var chat_count: Int,

  @Column()
  var user_id: Long,

  @Column()
  var category_id: Long,

  @Column()
  var price: Long,

  @Column()
  var image: String = "",

  @Column()
  var location_id: Long,

  @Column()
  var reports_count: Int = 0,

  @Column()
  var likes_count: Int = 0,

  @Lob
  @Column()
  var contract: String,

  @Column()
  var product: String,

  @Column()
  var reviews_count: Int = 0,

  @Column()
  var rating_avg: Float = 0.0f,

  @CreationTimestamp
  var created_at: Date,

  @UpdateTimestamp
  var updated_at: Date,
)
