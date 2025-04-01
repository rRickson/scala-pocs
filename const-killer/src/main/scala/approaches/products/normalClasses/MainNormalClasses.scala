package com.rRickson
package approaches.products.normalClasses

import approaches.products.Food

class MainNormalClasses {
  def normalClass(product: Food): Unit = {
    val productDrinkCls = ProductDrink()
    val productFoodCls = ProductMainDish()
    val productDesertCls = ProductDesert()
    // This approach uses normal classes to check the type of product using OO to be able to do business logic without the need of
    // checking the type of product by strings
    if (productDrinkCls.isProduct(product)) {
      println(s"${product.name} is a drink")
    } else if (productFoodCls.isProduct(product)) {
      println(s"${product.name} is food")
    } else if (productDesertCls.isProduct(product)) {
      println(s"${product.name} is a desert")
    }

  }

}
