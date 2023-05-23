package ru.cloudunion.delivery.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import ru.cloudunion.delivery.R
import ru.cloudunion.delivery.presentation.components.ButtonCustom
import ru.cloudunion.delivery.presentation.components.Counter
import ru.cloudunion.delivery.presentation.components.TextHeading
import ru.cloudunion.delivery.presentation.components.TextSimple
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme
import ru.cloudunion.delivery.presentation.util.Constants
import ru.cloudunion.delivery.presentation.util.getRubleSign

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
        .weight(.9f)
        .padding(bottom = 18.dp),
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
          TextHeading(
            text = "Карпаччо из мраморной\nговядины",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            color = DeliveryTheme.colors.primaryText
          )
          Spacer(modifier = Modifier.height(12.dp))
          TextSimple(
            text="Слайсы охлажденной мраморной говядины, поданные в виде рулетов с соусом песто.",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
          )
        }
      }
    }
    Box(
      modifier = Modifier
        .fillMaxSize()
        .weight(.1f),
    ) {
      AddInCart(navController = navController)
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
fun AddInCart(navController: NavHostController) {
  Row(
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.fillMaxWidth()
  ) {
    Counter()
    Image(
      painter = painterResource(id = R.drawable.ic_delivery_availability),
      contentDescription = null,
      colorFilter = ColorFilter.tint(DeliveryTheme.colors.tintColor),
      modifier = Modifier
        .width(25.dp)
        .height(25.dp),
      contentScale = ContentScale.Inside
    )
    ButtonCustom(
      onClick = {
        navController.navigate(Constants.Screens.CART_SCREEN)
      }
    ) {
      Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
          text = "ОТ 420${getRubleSign()}",
          modifier = Modifier.weight(1f),
          fontSize = 20.sp,
        )
        Icon(
          imageVector = ImageVector.vectorResource(R.drawable.ic_shopping_cart),
          contentDescription = null,
          tint = DeliveryTheme.colors.primaryBackground
        )
      }
    }
  }
}