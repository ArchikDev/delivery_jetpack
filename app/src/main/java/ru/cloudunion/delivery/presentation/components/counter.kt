package ru.cloudunion.delivery.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.cloudunion.delivery.R
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme

@Composable
fun Counter() {
  Row(modifier = Modifier.width(80.dp)) {
    Box(modifier = Modifier
      .background(DeliveryTheme.colors.primaryText, CircleShape)
    ) {
      Icon(
        imageVector = ImageVector.vectorResource(R.drawable.ic_remove_minus),
        contentDescription = null,
        tint = DeliveryTheme.colors.primaryBackground,
        modifier = Modifier.size(25.dp)
      )
    }
    Text(
      text = "1",
      modifier = Modifier.weight(1f),
      textAlign = TextAlign.Center,
      fontSize = 18.sp,
      color = DeliveryTheme.colors.primaryText
    )
    Box(modifier = Modifier
      .background(DeliveryTheme.colors.primaryText, CircleShape)
    ) {
      Icon(
        imageVector = ImageVector.vectorResource(R.drawable.ic_add_plus),
        contentDescription = null,
        tint = DeliveryTheme.colors.primaryBackground,
        modifier = Modifier.size(25.dp)
      )
    }
  }
}