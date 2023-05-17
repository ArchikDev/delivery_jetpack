package ru.cloudunion.delivery.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import ru.cloudunion.delivery.R
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
  Row(
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.fillMaxWidth()
  ) {
    Counter()
    Image(
      painter = painterResource(id = R.drawable.ic_delivery_availability),
      contentDescription = null,
      colorFilter = ColorFilter.tint(Color.Black),
      modifier = Modifier
        .width(25.dp)
        .height(25.dp),
      contentScale = ContentScale.Inside
    )
    Button(
      onClick = { /*TODO*/ },
      modifier = Modifier
        .height(45.dp)
        .width(210.dp),
      colors = ButtonDefaults.buttonColors(
        backgroundColor = Color.Black,
        contentColor = Color.White
      )
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
          tint = Color.White
        )
      }
    }
  }
}

@Composable
fun Counter() {
  Row(modifier = Modifier.width(80.dp)) {
    Box(modifier = Modifier
      .background(Color.Black, CircleShape)
    ) {
      Icon(
        imageVector = ImageVector.vectorResource(R.drawable.ic_remove_minus),
        contentDescription = null,
        tint = Color.White,
        modifier = Modifier.size(23.dp)
      )
    }
    Text(
      text = "1",
      modifier = Modifier.weight(1f),
      textAlign = TextAlign.Center,
      fontSize = 18.sp
    )
    Box(modifier = Modifier
      .background(Color.Black, CircleShape)
    ) {
      Icon(
        imageVector = ImageVector.vectorResource(R.drawable.ic_add_plus),
        contentDescription = null,
        tint = Color.White,
        modifier = Modifier.size(23.dp)
      )
    }
  }
}