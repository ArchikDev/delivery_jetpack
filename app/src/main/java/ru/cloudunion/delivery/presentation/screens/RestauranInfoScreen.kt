package ru.cloudunion.delivery.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.cloudunion.delivery.R

@Preview
@Composable
fun RestauranInfoScreen() {
  Column(modifier = Modifier.fillMaxWidth()) {
    Box(contentAlignment = Alignment.BottomStart) {
      Image(
        painter = painterResource(id = R.drawable.del_1),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
      )
      Box(
        modifier = Modifier
          .background(Color.White, CircleShape)
          .size(55.dp, 55.dp),
        contentAlignment = Alignment.Center
      ) {
        Image(
          painter = painterResource(id = R.drawable.del_rocket_pizza),
          contentDescription = null,
          colorFilter = ColorFilter.tint(Color.Black),
          modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        )
      }
    }
  }
}

