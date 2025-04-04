package com.rRickson
package approaches.elegantObject.entity


case class PersonEntity(
   name:String,
   status: Status | String
 ) {

  def toDto:PersonEntity={
    this.copy(
      status= status match {
        case s:Status =>  PersonStatusTrait().getStatus(s)
        case _ => status
      }
    )
  }

  def toEntity:PersonEntity={
    this.copy(
      status= status match {
        case s:String => PersonStatusTrait().getStatus(s)
        case _ => status
      }
    )
  }
}
