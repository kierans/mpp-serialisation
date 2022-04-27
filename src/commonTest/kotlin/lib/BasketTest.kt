package lib

import io.kotest.core.spec.style.DescribeSpec
import lib.data.basketDTO
import lib.model.fromDTO

class BasketTest : DescribeSpec({
    describe("Basket Transformer") {
        describe("from DTO") {
            it("should convert DTO") {
                val dto = basketDTO()

                val result: Basket = fromDTO(dto)
                //result.shouldBe(basketFrom(dto))
            }
        }
    }
})
