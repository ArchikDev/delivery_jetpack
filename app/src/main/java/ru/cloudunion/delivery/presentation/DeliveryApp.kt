package ru.cloudunion.delivery.presentation

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import ru.cloudunion.delivery.presentation.navigation.NavGraph

@Composable
fun DeliveryApp() {
  val navController = rememberNavController()
  Surface(
    color = MaterialTheme.colors.background
  ) {
    // убираем ripple-эффект через CompositionLocalProvider
    CompositionLocalProvider(
      LocalRippleTheme provides ClearRippleTheme
    ) {
      NavGraph(navController = navController)
    }
  }
}


object ClearRippleTheme : RippleTheme {
  @Composable
  override fun defaultColor(): Color = Color.Transparent

  @Composable
  override fun rippleAlpha() = RippleAlpha(
    draggedAlpha = 0.0f,
    focusedAlpha = 0.0f,
    hoveredAlpha = 0.0f,
    pressedAlpha = 0.0f,
  )
}
