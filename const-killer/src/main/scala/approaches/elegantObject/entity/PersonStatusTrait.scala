package com.rRickson
package approaches.elegantObject.entity

sealed trait Status

class PersonStatusTrait {
  
  private final class Active extends Status 

  private final class Inactive extends Status 
  
  
  def getStatus(status: String): Status = {
    status match {
      case "active" => Active()
      case "inactive" => Inactive()
      case _ => throw Exception("not found")
    }
  }

  def getStatus(status: Status): String = {
    status match {
      case _:Active=> "active"
      case _:Inactive => "inactive"
      case _ => throw Exception("not found")
    }
  }
}
