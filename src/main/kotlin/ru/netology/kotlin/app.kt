fun main() {
   //println("First App!")
    val itemPrice = 100
    val itemCount = 11
    val discount = 10
    val discountStart = 1_000

    var totalPrice: Int = itemPrice * itemCount
    if (totalPrice >= discountStart) {
        totalPrice -= discount
    }
    println("total price: $totalPrice")

}