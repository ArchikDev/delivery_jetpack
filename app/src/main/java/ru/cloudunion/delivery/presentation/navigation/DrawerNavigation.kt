package ru.cloudunion.delivery.presentation.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme

@Composable
fun DrawerHeader() {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .height(170.dp)
      .background(Color.Gray),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center

  ) {
    Text(
      text = "Header",
      fontSize = 20.sp,
      color = Color.White
    )
  }
}

@Composable
fun DrawerBody(navController: NavHostController, scaffoldState: ScaffoldState) {
  val coroutineScope = rememberCoroutineScope()

  LazyColumn(modifier = Modifier.fillMaxWidth()) {
    items(5) {
      Text(
        text = "Menu item $it",
        color = DeliveryTheme.colors.primaryText,
        modifier = Modifier
          .fillMaxWidth()
          .clickable {
            navController.navigate(NavRoute.MyOrder.route)

            coroutineScope.launch {
              scaffoldState.drawerState.close()
            }
          }
          .padding(10.dp))
    }
  }
}