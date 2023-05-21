package ru.cloudunion.delivery.presentation.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme

@Composable
fun ButtonCustom(
  onClick: () -> Unit,
  content: @Composable RowScope.() -> Unit
) {
  Button(
    onClick = onClick,
    modifier = Modifier
      .height(45.dp)
      .width(210.dp),
    colors = ButtonDefaults.buttonColors(
      backgroundColor = Color.Black,
      contentColor = Color.White
    ),
    content = content
  )
}

@Composable
fun TextHeading(
  text: String,
  textAlign: TextAlign = TextAlign.Start,
  maxLines: Int = 999,
  color: Color = DeliveryTheme.colors.primaryText,
  modifier: Modifier = Modifier
) {
  Text(
    text = text,
    color = color,
    textAlign = textAlign,
    maxLines = maxLines,
    style = DeliveryTheme.typography.heading,
    modifier = modifier
  )
}

