package com.rRickson
package approaches.products.normalClasses

import approaches.products.Food

class ProductDesert {
  private val DESERT = "desert"

  def getProductType: String = {
    DESERT
  }

  def isProduct(product:Food): Boolean = {
    product.productType == DESERT
  }
}
