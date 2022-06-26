package com.belveth.bullettime.domain.like.entity

import com.sun.istack.NotNull
import java.util.*
import javax.persistence.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Index
import javax.persistence.Table
import org.hibernate.annotations.*

@Entity
@Table(name = "likes", indexes = [
    Index(columnList = "user_id"),
    Index(columnList = "target_type, target_id"),
])
@DynamicInsert
@DynamicUpdate
class LikeEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    @Column(name = "target_id") @NotNull() var targetId: Long,
    @Column(name = "target_type") @NotNull() var targetType: String,
    @Column(name = "user_id") @NotNull() var userId: Long,
    @Column(name = "created_at") @CreationTimestamp var createdAt: Date?,
    @Column(name = "updated_at") @UpdateTimestamp var updatedAt: Date?,
)
