package ru.cloudunion.delivery.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DeliveryTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
  val colors = if (darkTheme) {
    baseDarkPallete
  } else {
    baseLightPallete
  }

  val typography = DeliveryTypography(
    body = TextStyle(
      fontSize = 16.sp,
    ),
    heading = TextStyle(
      fontSize = 22.sp,
      fontWeight = FontWeight.Normal
    ),
    toolbar = TextStyle(
      fontFamily = fontsSan,
      fontSize = 21.sp,
      fontWeight = FontWeight.Normal
    )
  )

  val shapes = DeliveryShape(
    padding = 16.dp,
    cornersStyle = RoundedCornerShape(8.dp)
  )

  CompositionLocalProvider(
    LocalDeliveryColors provides colors,
    LocalDeliveryTypography provides typography,
    LocalDeliveryShapes provides shapes,
    content = content
  )
}