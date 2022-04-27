package lib.data

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import lib.Basket
import lib.BasketItem

fun aNewBasket(): Basket =
    Basket(
        items = listOf(
            BasketItem(
                label = "Item 1"
            )
        )
    )

fun basketDTO(): JsonObject =
    JsonObject(mapOf(
        "items" to JsonArray(listOf(
            JsonObject(mapOf(
                "label" to JsonPrimitive("Item 1")
            ))
        )
   )))
