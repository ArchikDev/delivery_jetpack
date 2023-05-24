package ru.cloudunion.delivery.presentation.theme

import androidx.compose.ui.graphics.Color

val Gray200 = Color(0xCC747576)
val Black200 = Color(0xFF303132)

val baseLightPallete = DeliveryColors(
  primaryText = Black200,
  primaryBackground = Color.White,
  secondaryText = Gray200,
  tintColor = Black200,
  tabTextColor = Black200,
  tabTextActiveColor = Color.White,
  tabBackground = Black200
)

val baseDarkPallete = DeliveryColors(
  primaryText = Color.White,
  primaryBackground = Black200,
  secondaryText = Color.White,
  tintColor = Color.White,
  tabTextColor = Color.White,
  tabTextActiveColor = Black200,
  tabBackground = Color.White
)