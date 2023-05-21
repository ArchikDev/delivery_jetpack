package ru.cloudunion.delivery.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

data class DeliveryColors(
  val primaryText: Color,
  val primaryBackground: Color,
  val secondaryText: Color,
  val tintColor: Color,
  val tabTextColor: Color,
  val tabTextActiveColor: Color,
  val tabBackground: Color,
)

data class DeliveryTypography(
  val heading: TextStyle,
  val body: TextStyle,
  val toolbar: TextStyle,
)

data class DeliveryShape(
  val padding: Dp,
  val cornersStyle: Shape
)

object DeliveryTheme {
  val colors: DeliveryColors
    @Composable
    get() = LocalDeliveryColors.current

  val typography: DeliveryTypography
    @Composable
    get() = LocalDeliveryTypography.current

  val shapes: DeliveryShape
    @Composable
    get() = LocalDeliveryShapes.current
}

//enum class DeliveryStyle {
//  Purple, Orange, Blue, Red, Green
//}
//
//enum class DeliverySize{
//  Small, Medium, Big
//}
//
//enum class DeliveryCorners {
//  Flat, Rounded
//}

val LocalDeliveryColors = staticCompositionLocalOf<DeliveryColors> {
  error("No colors provided")
}

val LocalDeliveryTypography = staticCompositionLocalOf<DeliveryTypography> {
  error("No font provided")
}

val LocalDeliveryShapes = staticCompositionLocalOf<DeliveryShape> {
  error("No shapes provided")
}