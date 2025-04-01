package com.rRickson

import approaches.products.Food
import approaches.products.normalClasses.{ProductDesert, ProductDrink, ProductMainDish}

import com.rRickson.approaches.products.companion.{Desert, Drink, MainDish}

@main
def main(): Unit = {

}

def normalClass(product:Food):Unit={
  val productDrinkCls = ProductDrink()
  val productFoodCls = ProductMainDish()
  val productDesertCls = ProductDesert()
  // This approach uses normal classes to check the type of product using OO to be able to do business logic without the need of
  // checking the type of product by strings
  if (productDrinkCls.isProduct(product)) {
    println(s"${product.name} is a drink")
  } else if (productFoodCls.isProduct(product)) {
    println(s"${product.name} is food")
  }else if (productDesertCls.isProduct(product)) {
    println(s"${product.name} is a desert")
  }

}

def companion(product:Food):Unit={
  // This approach uses companion objects to check the type of product using OO to be able to do business logic without the need of
  // checking the type of product by strings
  if (Drink.isProduct(product)) {
    println(s"${product.name} is a drink")
  } else if (MainDish.isProduct(product)) {
    println(s"${product.name} is food")
  }else if (Desert.isProduct(product)) {
    println(s"${product.name} is a desert")
  }
}
