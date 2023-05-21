package ru.cloudunion.delivery.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import ru.cloudunion.delivery.RestauranData
import ru.cloudunion.delivery.RestauranDetailItem
import ru.cloudunion.delivery.presentation.components.Tabs
import ru.cloudunion.delivery.presentation.components.TextHeading
import ru.cloudunion.delivery.presentation.mock.MockData
import ru.cloudunion.delivery.presentation.mock.MockData.TabsFilter
import ru.cloudunion.delivery.presentation.navigation.NavRoute
import ru.cloudunion.delivery.presentation.navigation.TopBarSecondary
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme
import ru.cloudunion.delivery.presentation.theme.baseLightPallete
import ru.cloudunion.delivery.presentation.util.getRubleSign

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RestauranDetailListScreen(
  restauranData: RestauranData,
  navController: NavHostController
) {
  var selectedTabIndex by remember { mutableStateOf(0) }

  Scaffold(
    topBar = { TopBarSecondary(
      title = restauranData.title,
      imageName = restauranData.imageName,
      navController = navController,
    ) },
    backgroundColor = DeliveryTheme.colors.primaryBackground
  ) {
    Column {
      Tabs(
        tabs = TabsFilter,
        selectedTabIndex = selectedTabIndex
      ) {
        selectedTabIndex = it
      }
      LazyColumn(modifier = Modifier
        .padding(
          start = 15.dp,
          end = 15.dp,
          top = 10.dp
        )) {
        items(getItemsFilter(
          restauranData.items,
          TabsFilter[selectedTabIndex].type
        )) { restauranItemData ->
          RestauranItem(restauranItemData = restauranItemData, onRestauranClick = {
//          navController.navigate("${Constants.Screens.RESTAURAN_DETAIL_SCREEN}/${RestauranData.id}")
            navController.navigate(NavRoute.RestauranDetailItem.route)
          })
        }
      }
    }
  }
}


@Composable
fun RestauranItem(
  restauranItemData: RestauranDetailItem,
  onRestauranClick: () -> Unit = {}
) {
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
    Column(modifier = Modifier.padding(15.dp)) {
      Row(
        modifier = Modifier
          .padding(bottom = 5.dp)
          .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
      ) {
        Column {
          Text(
            text = "${restauranItemData.price}${getRubleSign()}",
            fontSize = 21.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(bottom = 4.dp)
          )
          Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = "${restauranItemData.weight} гр.",
            fontSize = 16.sp,
            fontWeight = FontWeight.Light
          )
          if (restauranItemData.icons.isNotEmpty()) {
            Row {
              restauranItemData.icons.forEach {
                Image(
                  modifier = Modifier.padding(end = 8.dp),
                  painter = painterResource(id = it),
                  contentDescription = null,
                )
              }

            }
          }
        }
        Image(
          modifier = Modifier
            .width(210.dp)
            .height(210.dp),
          painter = painterResource(id = restauranItemData.image),
          contentDescription = null,
        )
      }
      TextHeading(
        text = restauranItemData.title,
        color = baseLightPallete.primaryText
      )
    }

  }
}

fun getItemsFilter(
  items: List<RestauranDetailItem>,
  type: Int
): List<RestauranDetailItem> {
  return items.filter { it.type == type }
}