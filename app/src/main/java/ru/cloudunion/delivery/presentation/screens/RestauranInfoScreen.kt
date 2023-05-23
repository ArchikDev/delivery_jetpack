package ru.cloudunion.delivery.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.cloudunion.delivery.R
import ru.cloudunion.delivery.presentation.components.TextHeading
import ru.cloudunion.delivery.presentation.components.TextSimple
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme

@Preview
@Composable
fun RestauranInfoScreen() {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .verticalScroll(rememberScrollState())
  ) {
    Box(contentAlignment = Alignment.BottomStart) {
      Image(
        painter = painterResource(id = R.drawable.del_1),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
      )
      Box(
        modifier = Modifier
          .clip(shape = RoundedCornerShape(50, 50, 50))
          .background(Color.White)
          .size(55.dp, 55.dp),
        contentAlignment = Alignment.Center
      ) {
        Image(
          painter = painterResource(id = R.drawable.del_rocket_pizza),
          contentDescription = null,
          colorFilter = ColorFilter.tint(Color.Black),
          modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp)
        )
      }
    }
    Column(modifier = Modifier.padding(10.dp)) {
      TextHeading(text = "Rocket Pizza")
      TextSimple(
        text = "Попробуй космос на вкус",
        fontSize = 15.sp,
        color = DeliveryTheme.colors.secondaryText
      )
      Spacer(modifier = Modifier.height(8.dp))
      TextSimple(
        text = "Lorem Ipsum - это текст-рыба, часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной рыбой для текстов на латинице с начала XVI века.",
      )
      Spacer(modifier = Modifier.height(20.dp))
      itemInfo(R.drawable.ic_house, "Калуга, Воскресенская, 6", -2)
      itemInfo(R.drawable.ic_time, "Ежедневно:\n16:00 - 02:00", 4)
      itemInfo(R.drawable.ic_delivery_availability, "Ежедневно:\n16:00 - 02:00", 4)
      itemInfo(R.drawable.ic_ruble, "Минимальная сумма заказа:\nот 899\nСтоимость доставки:\nот 149", 4)
      itemInfo(R.drawable.ic_call, "+79999999999", -2)
    }
  }
}

@Composable
private fun itemInfo(img: Int, txt: String, offsetY: Int = 0) {
  Row(
    modifier=Modifier.padding(bottom = 15.dp),
    verticalAlignment = Alignment.Top
  ) {
    Image(
      painter = painterResource(id = img),
      contentDescription = null,
      colorFilter = ColorFilter.tint(DeliveryTheme.colors.primaryText),
      modifier = Modifier
        .width(25.dp)
        .height(25.dp)
        .offset(y = offsetY.dp),
      contentScale = ContentScale.Inside
    )
    Spacer(modifier = Modifier.width(12.dp))
    TextSimple(
      text = txt,
      fontSize = 15.sp,
      fontWeight = FontWeight.Normal
    )
  }
}

