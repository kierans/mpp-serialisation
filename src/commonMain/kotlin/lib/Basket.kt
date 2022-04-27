package lib

import kotlinx.serialization.Serializable

@Serializable
data class Basket(
    val items: List<BasketItem>
) : ModelType

@Serializable
data class BasketItem(
    val label: String
) : ModelType

