package com.rRickson
package approaches.products.companion

import approaches.products.Food

trait FoodType {
  def asString:String;
  def isProduct(product:Food): Boolean = {
    product.productType == asString
  }
}

object FoodType {
  def fromString(value: String): Option[FoodType] = value.toLowerCase match {
    case "drink"   => Some(Drink)
    case "mainDish"    => Some(MainDish)
    case "dessert" => Some(Desert)
    case _         => None
  }
}