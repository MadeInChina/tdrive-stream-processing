package tdrive.shared

/**
  * From https://rosettacode.org/wiki/Haversine_formula
  */
object Haversine {
  import math._
  val R = 6372.8  //radius in km

  def haversine(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double ={
    val dLat=(lat2 - lat1).toRadians
    val dLon=(lon2 - lon1).toRadians

    val a = pow(sin(dLat/2),2) + pow(sin(dLon/2),2) * cos(lat1.toRadians) * cos(lat2.toRadians)
    val c = 2 * asin(sqrt(a))
    R * c
  }
}
