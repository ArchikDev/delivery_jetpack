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
  object Main: NavRoute(Constants.Screens.MAIN_SCREEN)
  object InfoDetail: NavRoute(Constants.Screens.RESTAURAN_DETAIL_INFO)
  object DetailItem: NavRoute(Constants.Screens.RESTAURAN_DETAIL_ITEM_SCREEN)
  object MyOrder: NavRoute(Constants.Screens.MY_ORDER_SCREEN)
  object RestauranDetail: NavRoute("${Constants.Screens.RESTAURAN_DETAIL_SCREEN}/{${Constants.Screens.RESTAURAN_DETAIL_ID}}")
}

@Composable
fun NavGraph(navController: NavHostController) {

  NavHost(navController = navController, startDestination = NavRoute.DetailItem.route) {
    composable(NavRoute.Start.route) { StartScreen(navController = navController) }
    composable(NavRoute.Main.route) { RestauranListScreen(navController = navController) }
    composable(NavRoute.DetailItem.route) { RestauranDetailItemScreen(navController = navController) }
    composable(NavRoute.InfoDetail.route) {  EnterAnimation {
      RestauranInfoScreen()
    } }
    composable(NavRoute.MyOrder.route) { MyOrderScreen(navController = navController) }
    composable(
      NavRoute.RestauranDetail.route,
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