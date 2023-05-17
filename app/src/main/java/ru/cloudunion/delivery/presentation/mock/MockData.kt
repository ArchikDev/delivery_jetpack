package ru.cloudunion.delivery.presentation.mock

import android.os.Build
import ru.cloudunion.delivery.R
import ru.cloudunion.delivery.RestauranData
import ru.cloudunion.delivery.RestauranDataFilter
import ru.cloudunion.delivery.RestauranDetailItem
import java.text.SimpleDateFormat
import java.util.*

object MockData {
  val RestauranList = listOf<RestauranData>(
    RestauranData(
      1,
      title = "Частная практика",
      descr = "Для тех, кто ценит себя и свой отдых",
      image = R.drawable.del_1,
      logo = 0,
      rating = 5.0f,
      imageName = R.drawable.del_practica,
      items = arrayListOf(
        RestauranDetailItem(
          id = 10,
          title = "Картофельный крем-суп с кальмарами",
          price = "350",
          weight = "270",
          image = R.drawable.dish_1,
          type = 1,
          icons = arrayListOf(R.drawable.ic_bar_availability, R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 11,
          title = "Суп Том Ям",
          price = "450",
          weight = "370",
          image = R.drawable.dish_2,
          type = 1,
          icons = arrayListOf(R.drawable.ic_bar_availability, R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 12,
          title = "Тартар из лосося с муссом",
          price = "520",
          weight = "170",
          image = R.drawable.dish_2,
          type = 2,
          icons = arrayListOf(R.drawable.ic_bar_availability, R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 13,
          title = "Карпаччо из мраморной говядины",
          price = "450",
          weight = "80",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_bar_availability, R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 14,
          title = "Классический тартар",
          price = "690",
          weight = "280",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_bar_availability, R.drawable.ic_delivery_availability),
        )
      )
    ),
    RestauranData(
      2,
      title = "Rocket Pizza",
      descr = "Попробуй космос на вкус",
      image = R.drawable.del_2,
      logo = 0,
      rating = 4.9f,
      imageName = R.drawable.del_rocket_pizza,
      items = arrayListOf(
        RestauranDetailItem(
          id = 20,
          title = "Пицца 1",
          price = "350",
          weight = "270",
          image = R.drawable.dish_1,
          type = 1,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 21,
          title = "Пицца 2",
          price = "150",
          weight = "370",
          image = R.drawable.dish_2,
          type = 1,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 22,
          title = "Пицца 3",
          price = "520",
          weight = "170",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 23,
          title = "Пицца 4",
          price = "450",
          weight = "80",
          image = R.drawable.dish_2,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 24,
          title = "Пицца 5",
          price = "690",
          weight = "280",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        )
      )
    ),
    RestauranData(
      3,
      title = "Китайка",
      descr = "Всеазиатская кухня",
      image = R.drawable.del_3,
      logo = 0,
      rating = 4.2f,
      imageName = R.drawable.del_kitai,
      items = arrayListOf(
        RestauranDetailItem(
          id = 30,
          title = "Утка 1",
          price = "350",
          weight = "270",
          image = R.drawable.dish_1,
          type = 1,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 31,
          title = "Утка 2",
          price = "150",
          weight = "370",
          image = R.drawable.dish_2,
          type = 1,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 32,
          title = "Утка 3",
          price = "520",
          weight = "170",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 33,
          title = "Утка 4",
          price = "450",
          weight = "80",
          image = R.drawable.dish_2,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 34,
          title = "Утка 5",
          price = "690",
          weight = "280",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        )
      )
    ),
    RestauranData(
      4,
      title = "Overtime",
      descr = "Жарим мясо на огне и дыме",
      image = R.drawable.del_4,
      logo = 0,
      rating = null,
      imageName = R.drawable.del_overtime,
      items = arrayListOf(
        RestauranDetailItem(
          id = 40,
          title = "Бургер 1",
          price = "350",
          weight = "270",
          image = R.drawable.dish_1,
          type = 1,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 41,
          title = "Бургер 2",
          price = "150",
          weight = "370",
          image = R.drawable.dish_2,
          type = 1,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 42,
          title = "Бургер 3",
          price = "520",
          weight = "170",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 43,
          title = "Бургер 4",
          price = "450",
          weight = "80",
          image = R.drawable.dish_2,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        ),
        RestauranDetailItem(
          id = 44,
          title = "Бургер 5",
          price = "690",
          weight = "280",
          image = R.drawable.dish_1,
          type = 2,
          icons = arrayListOf(R.drawable.ic_delivery_availability),
        )
      )
    ),
  )

  val TabsFilter = listOf(
    RestauranDataFilter(1, "Первая", 1),
    RestauranDataFilter(2, "Вторая", 2),
    RestauranDataFilter(3, "Третья", 1),
    RestauranDataFilter(4, "Четвертая", 2),
    RestauranDataFilter(5, "Пятая", 1),
  )

  fun getRestauran(newsId: Int?): RestauranData {
    return RestauranList.first { it.id == newsId }
  }

  fun Date.getTimeAgo(): String {
    val calendar = Calendar.getInstance()
    calendar.time = this

    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH)
    val day = calendar.get(Calendar.DAY_OF_MONTH)
    val hour = calendar.get(Calendar.HOUR_OF_DAY)
    val minute = calendar.get(Calendar.MINUTE)

    val currentCalendar = Calendar.getInstance()

    val currentYear = currentCalendar.get(Calendar.YEAR)
    val currentMonth = currentCalendar.get(Calendar.MONTH)
    val currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH)
    val currentHour = currentCalendar.get(Calendar.HOUR_OF_DAY)
    val currentMinute = currentCalendar.get(Calendar.MINUTE)

    return if (year < currentYear) {
      val interval = currentYear - year
      if (interval == 1) "$interval year ago" else "$interval years ago"
    } else if (month < currentMonth) {
      val interval = currentMonth - month
      if (interval == 1) "$interval month ago" else "$interval months ago"
    } else if (day < currentDay) {
      val interval = currentDay - day
      if (interval == 1) "$interval day ago" else "$interval days ago"
    } else if (hour < currentHour) {
      val interval = currentHour - hour
      if (interval == 1) "$interval hour ago" else "$interval hours ago"
    } else if (minute < currentMinute) {
      val interval = currentMinute - minute
      if (interval == 1) "$interval minute ago" else "$interval minutes ago"
    } else {
      "a moment ago"
    }
  }
  //Todo 9: Create a method to convert String to date
  fun stringToDate(publishedAt: String): Date {
    val date =
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.ENGLISH).parse(publishedAt)
      } else {
        java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.ENGLISH).parse(publishedAt)
      }
    return date
  }
}