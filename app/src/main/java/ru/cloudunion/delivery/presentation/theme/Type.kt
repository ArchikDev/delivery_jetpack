package ru.cloudunion.delivery.presentation.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
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


// Set of Material typography styles to start with
val Typography = Typography(
  body1 = TextStyle(
    fontFamily = fontsSan,
    fontSize = 16.sp
  ),
  h1 = TextStyle(
    fontFamily = fontsSan,
    fontSize = 21.sp,
    fontWeight = FontWeight.Normal
  )
  /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)