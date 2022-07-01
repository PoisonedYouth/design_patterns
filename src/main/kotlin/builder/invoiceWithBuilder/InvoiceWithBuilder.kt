package builder.invoiceWithBuilder

import builder.invoiceWithBuilder.Invoice.InvoiceBuilder
import java.math.BigDecimal

class Invoice private constructor(
    private val title: String,
    private val amount: BigDecimal,
    private val discount: BigDecimal?,
    private val extraCharge: BigDecimal?,
    private val positions: List<Position>,
    private val comment: String?
) {

    class InvoiceBuilder(
        private val title: String,
        private val amount: BigDecimal
    ) {
        var discount: BigDecimal? = null
        var extraCharge: BigDecimal? = null
        var positions: List<Position> = mutableListOf()
        var comment: String? = null

        fun withDiscount(discount: BigDecimal): InvoiceBuilder {
            this.discount = discount
            return this
        }

        fun withExtraCharge(extraCharge: BigDecimal): InvoiceBuilder {
            this.extraCharge = extraCharge
            return this
        }

        fun withPositions(positions: List<Position>): InvoiceBuilder {
            this.positions += positions
            return this
        }

        fun withComment(comment: String): InvoiceBuilder {
            this.comment = comment
            return this
        }

        fun build(): Invoice {
            return Invoice(
                this.title,
                this.amount,
                this.discount,
                this.extraCharge,
                this.positions,
                this.comment
            )
        }
    }
}

class Position(
    private val amount: BigDecimal,
    private val product: String,
    private val quantity: Int
)


val invoice = InvoiceBuilder(
    "Invoice 0001",
    BigDecimal(123.0)
)
    .withExtraCharge(BigDecimal(20.0))
    .withPositions(
        listOf(
            Position(
                amount = BigDecimal(100.0),
                product = "Product A",
                quantity = 1
            ),
            Position(
                amount = BigDecimal(23.0),
                product = "Product B",
                quantity = 1
            )
        )
    ).build()