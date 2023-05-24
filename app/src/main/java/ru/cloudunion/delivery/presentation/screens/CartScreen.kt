package ru.cloudunion.delivery.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
import ru.cloudunion.delivery.presentation.navigation.TopBarSimple
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme
import ru.cloudunion.delivery.presentation.theme.baseDarkPallete
import ru.cloudunion.delivery.presentation.theme.baseLightPallete
import ru.cloudunion.delivery.presentation.util.getRubleSign

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CartScreen(navController: NavHostController) {
  Scaffold(
    topBar = { TopBarSimple(title = "Корзина", navController = navController) },
    backgroundColor = DeliveryTheme.colors.primaryBackground
  ) {
    Column(
      modifier = Modifier
        .verticalScroll(rememberScrollState())
        .padding(start = 15.dp, end = 15.dp),
    ) {
      itemProductCart()
      total()
    }
  }
}

@Composable
private fun itemProductCart() {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(top = 7.dp, bottom = 15.dp)
      .clickable { },
    shape = RoundedCornerShape(15.dp),
    elevation = 10.dp
  ) {
    Row(
      modifier = Modifier
        .height(IntrinsicSize.Min)
        .padding(16.dp),
      verticalAlignment = Alignment.CenterVertically
    ) {
      Image(
        painter = painterResource(id = R.drawable.del_1),
        contentDescription = null,
        modifier = Modifier
          .size(70.dp)
          .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Crop,
      )
      Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
          .fillMaxSize()
          .padding(start = 10.dp)
      ) {
        Row(
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.Top,
          modifier = Modifier.fillMaxWidth()
        ) {
          TextHeading(text = "Том Ям", color = baseLightPallete.primaryText)
          Image(
            painter = painterResource(id = R.drawable.ic_delivery_availability),
            contentDescription = null,
            colorFilter = ColorFilter.tint(baseLightPallete.primaryText),
            modifier = Modifier
              .width(25.dp)
              .height(25.dp),
            contentScale = ContentScale.Inside
          )
        }
        Column(modifier = Modifier.padding(top = 2.dp, bottom = 5.dp)) {
          TextSimple(text = "Том Ям", fontSize = 15.sp, color = baseLightPallete.primaryText)
          TextSimple(text = "Том Ям", fontSize = 15.sp, color = baseLightPallete.primaryText)
        }
        Row(
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically,
          modifier = Modifier.fillMaxWidth()
        ) {
          TextHeading(
            text = "1410${getRubleSign()}",
            color = baseLightPallete.primaryText
          )
          Counter(
            colorText = baseLightPallete.primaryText,
            colorTint = baseLightPallete.primaryBackground
          )
        }
      }
    }
  }
}

@Composable
private fun total() {
  Column(modifier = Modifier.fillMaxWidth()) {
    Row(
      modifier = Modifier.fillMaxWidth(),
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      TextSimple(
        text = "Итого в корзине",
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
      )
      TextSimple(
        text = "1500${getRubleSign()}",
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        textAlign = TextAlign.End
      )
    }
    Spacer(modifier = Modifier.height(4.dp))
    Row(
      modifier = Modifier.fillMaxWidth(),
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      TextSimple(text = "Скидка", fontWeight = FontWeight.Normal)
      TextSimple(text = "0%", textAlign = TextAlign.End, fontWeight = FontWeight.Normal)
    }
    Spacer(modifier = Modifier.height(4.dp))
    Row(
      modifier = Modifier.fillMaxWidth(),
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      TextSimple(text = "Доставка", fontWeight = FontWeight.Normal)
      TextSimple(text = "0${getRubleSign()}", textAlign = TextAlign.End, fontWeight = FontWeight.Normal)
    }
    ButtonCustom(onClick = { /*TODO*/ }) {
      Text(text = "Доставка")
    }
  }
}