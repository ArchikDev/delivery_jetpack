package ru.cloudunion.delivery.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//private val DarkColorPalette = darkColors(
//  primary = Purple200,
//  primaryVariant = Purple700,
//  secondary = Black200
//)
//
//private val LightColorPalette = lightColors(
//  primary = Purple500,
//  primaryVariant = Purple700,
//  secondary = Black200

  /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
//)

@Composable
fun DeliveryTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
  val colors = if (darkTheme) {
    baseDarkPallete
  } else {
    baseLightPallete
  }

  val typography = DeliveryTypography(
    body = TextStyle(
      fontFamily = fontsSan,
      fontSize = 16.sp,
    ),
    heading = TextStyle(
      fontFamily = fontsSan,
      fontSize = 21.sp,
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


//  MaterialTheme(
//    colors = colors,
//    typography = Typography,
//    shapes = Shapes,
//    content = content
//  )
  CompositionLocalProvider(
    LocalDeliveryColors provides colors,
    LocalDeliveryTypography provides typography,
    LocalDeliveryShapes provides shapes,
    content = content
  )
}