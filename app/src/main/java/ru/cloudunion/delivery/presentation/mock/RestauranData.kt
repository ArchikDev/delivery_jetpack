package ru.cloudunion.delivery

data class RestauranDetailItem(
  val id: Int,
  val title: String,
  val price: String,
  val weight: String,
  val image: Int,
  val type: Int,
  val icons: List<Int>,
)

data class RestauranData(
  val id: Int,
  val title: String,
  val descr: String,
  val image: Int,
  val logo: Int,
  val rating: Float? = null,
  val imageName: Int,
  val items: List<RestauranDetailItem>,
)

data class RestauranDataFilter(
  val id: Int,
  val title: String,
  val type: Int
)