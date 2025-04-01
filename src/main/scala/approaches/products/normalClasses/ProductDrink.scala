package com.rRickson
package approaches.products.normalClasses

import approaches.products.Food

class ProductDrink {
  private val DRINK = "drink"

  def getProductType: String = {
    DRINK
  }

  def isProduct(product:Food): Boolean = {
    product.productType == DRINK
  }
}
