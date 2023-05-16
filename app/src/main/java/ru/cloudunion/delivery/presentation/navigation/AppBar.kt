package ru.cloudunion.delivery.presentation.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch
import ru.cloudunion.delivery.R

@Composable
fun TopBarMain(
  title: String,
  scaffoldState: ScaffoldState
) {
  val coroutineScope = rememberCoroutineScope()

  return TopAppBar(
    title = {
      Text(
        text = title,
        modifier = Modifier.offset(x = (-20).dp),
        style = MaterialTheme.typography.h1
      )
    },
    backgroundColor = Color.White,
    navigationIcon = {
      IconButton(
        modifier = Modifier.offset(x = (-2).dp),
        onClick = {
          coroutineScope.launch {
            scaffoldState.drawerState.open()
          }
        }
      ) {
        Icon(
          imageVector = ImageVector.vectorResource(R.drawable.ic_menu),
          contentDescription = "Menu",
        )
      }
    },
    elevation = 0.dp
  )
}

@Composable
fun TopBarSecondary(
  title: String,
  imageName: Int,
  navController: NavHostController
) {
  val coroutineScope = rememberCoroutineScope()

  return TopAppBar(
    title = {
      Text(
        text = title,
        modifier = Modifier.offset(x = (-24).dp).fillMaxWidth(),
        style = MaterialTheme.typography.h1,
        maxLines = 1
      )
    },
    backgroundColor = Color.White,
    navigationIcon = {
      IconButton(
        modifier = Modifier.offset(x = (-5).dp),
        onClick = {
          coroutineScope.launch {
            navController.popBackStack()
          }
        }
      ) {
        Icon(
          imageVector = ImageVector.vectorResource(R.drawable.ic_back),
          contentDescription = "Back",
        )
      }
    },
    elevation = 0.dp,
    actions = {
      IconButton(
        onClick = {
          coroutineScope.launch {
//            val result = scaffoldState.snackbarHostState.showSnackbar(
//              message = "Item deleted",
//              actionLabel = "Undone"
//            )
//
//            if (result == SnackbarResult.ActionPerformed) {
//              Toast.makeText(context, "item recovered", Toast.LENGTH_SHORT).show()
//            }
          }
        }
      ) {
        Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_search), contentDescription = "delete")
      }
      IconButton(
        onClick = {

          navController.navigate(NavRoute.InfoDetail.route)
        }
      ) {
        Image(
          painter = painterResource(id = imageName),
          contentDescription = "image",
          colorFilter = ColorFilter.tint(Color.Black),
          modifier = Modifier
            .width(50.dp)
            .padding(10.dp)
        )
//        Icon(imageVector = Icons.Filled.Share, contentDescription = "Share")
      }
    }
  )
}