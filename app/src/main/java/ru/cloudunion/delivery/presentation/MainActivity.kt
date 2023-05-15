package ru.cloudunion.delivery.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      DeliveryTheme {
        DeliveryApp()
      }
    }
  }
}