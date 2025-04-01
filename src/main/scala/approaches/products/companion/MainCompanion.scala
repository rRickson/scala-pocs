package com.rRickson
package approaches.products.companion

import approaches.products.Food

class MainCompanion {
  def companion(product: Food): Unit = {
    // This approach uses companion objects to check the type of product using OO to be able to do business logic without the need of
    // checking the type of product by strings
    if (Drink.isProduct(product)) {
      println(s"${product.name} is a drink")
    } else if (MainDish.isProduct(product)) {
      println(s"${product.name} is food")
    } else if (Desert.isProduct(product)) {
      println(s"${product.name} is a desert")
    }
  }
}
