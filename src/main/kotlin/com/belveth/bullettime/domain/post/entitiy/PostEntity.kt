package com.belveth.bullettime.domain.post.entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
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
@DynamicInsert
@DynamicUpdate
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

  @Column(name = "rent_count")
  var rentCount: Int,

  @Column(name = "like_count")
  var likeCount: Int,

  @Column(name = "chat_count")
  var chatCount: Int,

  @Column(name = "user_id")
  var userId: Long,

  @Column(name = "category_id")
  var categoryId: Long,

  @Column()
  var price: Long,

  @Column()
  var image: String? = "",

  @Column(name = "location_id")
  var locationId: Long,

  @Column(name = "reports_count")
  var reportsCount: Int = 0,

  @Column(name = "likes_count")
  var likesCount: Int = 0,

  @Lob
  @Column()
  var contract: String,

  @Column()
  var product: String,

  @Column(name = "reviews_count")
  var reviewsCount: Int = 0,

  @Column(name = "rating_avg")
  var ratingAvg: Float = 0.0f,

  @CreationTimestamp
  @Column(name = "created_at")
  var createdAt: Date?,

  @UpdateTimestamp
  @Column(name = "updated_at")
  var updatedAt: Date?,
)
