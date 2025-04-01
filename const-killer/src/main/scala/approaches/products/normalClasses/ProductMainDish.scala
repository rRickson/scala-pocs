package com.rRickson
package approaches.products.normalClasses

import approaches.products.Food

class ProductMainDish {
  private val MAIN_DISH = "mainDish"

  def getProductType: String = {
    MAIN_DISH
  }

  def isProduct(product:Food): Boolean = {
    product.productType == MAIN_DISH
  }
}
