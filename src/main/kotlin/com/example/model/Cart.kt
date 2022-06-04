package com.example.model

import com.example.utils.json
import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.uuid
import java.util.UUID

interface Cart: Entity<Cart> {
    companion object: Entity.Factory<Cart>()

    val id: UUID
    val user: User
    val products: List<CartProduct>
}

object Carts: Table<Cart>("carts") {
    val id = uuid("id").primaryKey().bindTo { it.id }
    val userId = uuid("userId").references(Users) { it.user }
    val products = json<List<CartProduct>>("products").bindTo { it.products }
}
