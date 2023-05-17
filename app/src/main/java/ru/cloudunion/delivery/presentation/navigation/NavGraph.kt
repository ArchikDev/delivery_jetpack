package ru.cloudunion.delivery.presentation.navigation

import androidx.compose.animation.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.cloudunion.delivery.presentation.mock.MockData
import ru.cloudunion.delivery.presentation.screens.*
import ru.cloudunion.delivery.presentation.util.Constants

sealed class NavRoute(val route: String) {
  object Start: NavRoute(Constants.Screens.START_SCREEN)
  object RestauranList: NavRoute(Constants.Screens.RESTAURAN_LIST_SCREEN)
  object RestauranInfo: NavRoute(Constants.Screens.RESTAURAN_DETAIL_INFO)
  object RestauranDetailItem: NavRoute(Constants.Screens.RESTAURAN_DETAIL_ITEM_SCREEN)
  object MyOrder: NavRoute(Constants.Screens.MY_ORDER_SCREEN)
  object RestauranDetailList: NavRoute("${Constants.Screens.RESTAURAN_DETAIL_LIST_SCREEN}/{${Constants.Screens.RESTAURAN_DETAIL_ID}}")
}

@Composable
fun NavGraph(navController: NavHostController) {

  NavHost(navController = navController, startDestination = NavRoute.RestauranList.route) {
    composable(NavRoute.Start.route) { StartScreen(navController = navController) }
    composable(NavRoute.RestauranList.route) { RestauranListScreen(navController = navController) }
    composable(NavRoute.RestauranDetailItem.route) { RestauranDetailItemScreen(navController = navController) }
    composable(NavRoute.RestauranInfo.route) {  EnterAnimation {
      RestauranInfoScreen()
    } }
    composable(NavRoute.MyOrder.route) { MyOrderScreen(navController = navController) }
    composable(
      NavRoute.RestauranDetailList.route,
      arguments = listOf(navArgument(Constants.Screens.RESTAURAN_DETAIL_ID) { type = NavType.IntType }
    )) { navBackStackEntry ->
      val id = navBackStackEntry.arguments?.getInt(Constants.Screens.RESTAURAN_DETAIL_ID)
      val restauranData = MockData.getRestauran(id)

      RestauranDetailListScreen(restauranData = restauranData, navController = navController)
    }
  }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun EnterAnimation(content: @Composable () -> Unit) {
  AnimatedVisibility(
    visible = true,
    enter = slideInVertically(
      initialOffsetY = { -40 }
    ) + expandVertically(
      expandFrom = Alignment.Top
    ) + fadeIn(initialAlpha = 0.3f),
    exit = slideOutVertically() + shrinkVertically() + fadeOut(),
    content = content,
    initiallyVisible = false
  )
}