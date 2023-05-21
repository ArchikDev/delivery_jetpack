package ru.cloudunion.delivery.presentation.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import ru.cloudunion.delivery.R


val fontsMarta = FontFamily(
  Font(R.font.marta_regular),
  Font(R.font.marta_bold, weight = FontWeight.Bold)
)

val fontsSan = FontFamily(
  Font(R.font.san_franc_regular),
  Font(R.font.san_franc_black, weight = FontWeight.Black),
  Font(R.font.san_franc_bold, weight = FontWeight.Bold),
  Font(R.font.san_franc_semi_bold, weight = FontWeight.SemiBold),
  Font(R.font.san_franc_medium, weight = FontWeight.Medium),
  Font(R.font.san_franc_light, weight = FontWeight.Light),
)

val fontsExo = FontFamily(
  Font(R.font.exo2_regular),
  Font(R.font.exo2_black, weight = FontWeight.Black),
  Font(R.font.exo2_bold, weight = FontWeight.Bold),
  Font(R.font.exo2_semi_bold, weight = FontWeight.SemiBold),
  Font(R.font.exo2_medium, weight = FontWeight.Medium),
  Font(R.font.exo2_light, weight = FontWeight.Light),
)