package ru.cloudunion.delivery.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ru.cloudunion.delivery.R

@Composable
fun RestauranDetailItemScreen(
  navController: NavHostController
) {
  Column(modifier = Modifier
    .fillMaxSize()
    .padding(top = 15.dp, start = 15.dp, end = 15.dp)) {
    Box(
      modifier = Modifier
        .fillMaxSize()
        .weight(.9f),
    ) {
      Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.Center
        ) {
          Image(
            painter = painterResource(id = R.drawable.dish_1),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Fit
          )
        }
        Column {
          Spacer(modifier = Modifier.height(10.dp))
          Text(
            text="Карпаччо из мраморной\nговядины",
            style = MaterialTheme.typography.h1,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
          )
          Spacer(modifier = Modifier.height(15.dp))
          Text(
            text="Слайсы охлажденной мраморной говядины, поданные в виде рулетов с соусом песто.",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
          )
        }

      }
    }
    Box(
      modifier = Modifier
        .fillMaxSize()
        .weight(.1f),
    ) {
      AddInCart()
    }
  }
//  Column(
//    modifier = Modifier
//      .fillMaxWidth()
//      .verticalScroll(rememberScrollState())
//  ) {
//    Box(contentAlignment = Alignment.BottomStart) {
//      Image(
//        painter = painterResource(id = R.drawable.del_1),
//        contentDescription = null,
//        modifier = Modifier.fillMaxWidth(),
//        contentScale = ContentScale.FillWidth
//      )
//      Box(
//        modifier = Modifier
//          .clip(shape = RoundedCornerShape(50, 50, 50))
//          .background(Color.White)
//          .size(55.dp, 55.dp),
//        contentAlignment = Alignment.Center
//      ) {
//        Image(
//          painter = painterResource(id = R.drawable.del_rocket_pizza),
//          contentDescription = null,
//          colorFilter = ColorFilter.tint(Color.Black),
//          modifier = Modifier
//            .fillMaxWidth()
//            .padding(7.dp)
//        )
//      }
//    }
//  }
}

@Composable
fun AddInCart() {
  Row {

  }
}