package ru.cloudunion.delivery.presentation.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import ru.cloudunion.delivery.R
import ru.cloudunion.delivery.RestauranDataFilter
import ru.cloudunion.delivery.presentation.theme.DeliveryTheme

@Composable
fun Tabs(
  tabs: List<RestauranDataFilter>,
  selectedTabIndex: Int,
  onTabClick: (Int) -> Unit
) {
  ScrollableTabRow(
    backgroundColor = Color.Transparent,
    selectedTabIndex = selectedTabIndex,
    contentColor = DeliveryTheme.colors.tabTextActiveColor,
    edgePadding = 0.dp,
    indicator = { TabIndicator(tabPosition = it, index = selectedTabIndex) }
  ) {
    tabs.forEachIndexed { tabIndex, tab ->
      val txtColor: Color by animateColorAsState(if (selectedTabIndex == tabIndex) DeliveryTheme.colors.tabTextActiveColor else DeliveryTheme.colors.tabTextColor,
        animationSpec = tween(200)
      )

      Tab(
        modifier = Modifier
          .zIndex(6f)
          .height(35.dp),
        selected = selectedTabIndex == tabIndex,
        onClick = { onTabClick(tabIndex) },
//        text = { Text(text = tab) },
        text = {
          TextSimple(
            text = tab.title,
            color = txtColor,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
          )
        },
//        selectedContentColor = Color.White,
//        unselectedContentColor = Color.Black
//        unselectedContentColor = MaterialTheme.colors.onSurface.copy(ContentAlpha.disabled)
      )
    }
  }
}

@Composable
fun TabIndicator(tabPosition: List<TabPosition>, index: Int) {
  val transition = updateTransition(targetState = index, label = "")
  val indicatorStart by transition.animateDp(
    transitionSpec = {
      tween(200)
//      if (initialState < targetState) {
//        spring(dampingRatio = 1f, stiffness = 50f)
//      } else {
//        spring(dampingRatio = 1f, stiffness = 100f)
//      }
    }, label = ""
  ) {
    tabPosition[it].left
  }

  val indicatorEnd by transition.animateDp(
    transitionSpec = {
      tween(200)
//      if (initialState < targetState) {
//        spring(dampingRatio = 1f, stiffness = 100f)
//      } else {
//        spring(dampingRatio = 1f, stiffness = 50f)
//      }
    }, label = ""
  ) {
    tabPosition[it].right
  }

  Box(
    Modifier
      .offset(x = indicatorStart)
      .wrapContentSize(align = Alignment.BottomStart)
      .width(indicatorEnd - indicatorStart)
      .padding(2.dp)
      .fillMaxSize()
      .background(color = DeliveryTheme.colors.tabBackground, RoundedCornerShape(50))
      .border(BorderStroke(2.dp, DeliveryTheme.colors.tabBackground), RoundedCornerShape(50))
      .zIndex(1f)
  )
}