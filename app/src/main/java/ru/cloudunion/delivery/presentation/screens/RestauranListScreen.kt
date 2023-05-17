package ru.cloudunion.delivery.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import ru.cloudunion.delivery.R
import ru.cloudunion.delivery.RestauranData
import ru.cloudunion.delivery.presentation.mock.MockData
import ru.cloudunion.delivery.presentation.navigation.DrawerBody
import ru.cloudunion.delivery.presentation.navigation.DrawerHeader
import ru.cloudunion.delivery.presentation.navigation.TopBarMain
import ru.cloudunion.delivery.presentation.util.Constants

@Composable
fun RestauranListScreen(navController: NavHostController) {
  val scaffoldState = rememberScaffoldState()

  Scaffold(
    scaffoldState = scaffoldState,
    topBar = { TopBarMain(title = "Заведения",  scaffoldState = scaffoldState) },
    drawerContent = {
      DrawerHeader()
      DrawerBody(navController = navController, scaffoldState = scaffoldState)
    },
  ) {
    LazyColumn(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
      items(MockData.RestauranList) { RestauranData ->
        itemRestaurants(restauranData = RestauranData, onRestauranClick = {
          navController.navigate("${Constants.Screens.RESTAURAN_DETAIL_LIST_SCREEN}/${RestauranData.id}")
//          navController.navigate(NavRoute.MyOrder.route)
        })
      }
    }
  }
}



@Composable
private fun itemRestaurants(restauranData: RestauranData, onRestauranClick: () -> Unit = {}) {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(top = 7.dp, bottom = 15.dp)
      .clickable {
        onRestauranClick()
      },
    shape = RoundedCornerShape(15.dp),
    elevation = 10.dp
  ) {
    Column {
      Box(contentAlignment = Alignment.BottomStart) {
        Image(
          painter = painterResource(id = restauranData.image),
          contentDescription = "image",
          contentScale = ContentScale.Crop,
          modifier = Modifier
            .fillMaxWidth()
            .height(230.dp)
        )
        Box(
          modifier = Modifier
            .offset(x = 15.dp, y = (-15).dp)
            .background(Color.White, CircleShape)
            .size(55.dp, 55.dp),
          contentAlignment = Alignment.Center
        ) {
          Image(
            painter = painterResource(id = restauranData.imageName),
            contentDescription = "image",
            colorFilter = ColorFilter.tint(Color.Black),
            modifier = Modifier
              .fillMaxWidth()
              .padding(10.dp)
          )
        }
      }

      Column(modifier = Modifier.padding(
        start = 16.dp,
        end = 16.dp,
        top = 16.dp,
        bottom = 16.dp,
      )) {
        Row(modifier = Modifier.fillMaxWidth()) {
          Column {
            Text(
              text = restauranData.title,
              style = MaterialTheme.typography.h1,
              modifier = Modifier.padding(bottom = 2.dp)
            )
            Text(
              text = restauranData.descr,
              fontSize = 15.sp,
              fontWeight = FontWeight.Light
            )
          }
          Row(
            modifier = Modifier
              .fillMaxWidth()
              .padding(top = 4.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Image(
              imageVector = ImageVector.vectorResource(R.drawable.ic_star),
              contentDescription = "start",
              modifier = Modifier
                .padding(end = 5.dp)
                .width(15.dp)
            )

            Text(
              text = if (restauranData.rating != null) restauranData.rating.toString() else "-",
              fontSize = 16.sp,
              fontWeight = FontWeight.Medium
            )
          }
        }
      }
    }
  }
}