package ru.cloudunion.delivery.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.SideEffect
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme
import ru.cloudunion.delivery.presentation.theme.baseDarkPallete
import ru.cloudunion.delivery.presentation.theme.baseLightPallete

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      DeliveryTheme {
//        val isDarkModeValue = isSystemInDarkTheme()
//
//        val systemUiController = rememberSystemUiController()
//
//        SideEffect {
//          systemUiController.setSystemBarsColor(
//            color = if (isDarkModeValue) baseDarkPallete.primaryBackground else baseLightPallete.primaryBackground,
//            darkIcons = !isDarkModeValue
//          )
//        }

        DeliveryApp()
      }
    }
  }
}