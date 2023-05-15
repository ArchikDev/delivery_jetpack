package ru.cloudunion.delivery.presentation.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import ru.cloudunion.delivery.presentation.navigation.DrawerBody
import ru.cloudunion.delivery.presentation.navigation.DrawerHeader
import ru.cloudunion.delivery.presentation.navigation.TopBarSecondary

@Composable
fun MyOrderScreen(navController: NavHostController) {
  Scaffold(
//    topBar = { TopBarSecondary(title = "Мои заказы", navController = navController) },
  ) {
    Text(text = "MyOrderScreen")
  }
}