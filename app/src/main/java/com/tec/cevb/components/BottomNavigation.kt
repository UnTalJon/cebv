package com.tec.cevb.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.tec.cevb.models.Items_bottom_nav.*
import com.tec.cevb.navigation.currentRoute

@Composable
fun BottomNavigation(
    navController: NavHostController
) {
    val items = listOf(
        Item_bottom_nav1,
        Item_bottom_nav2,
        Item_bottom_nav3,
        Item_bottom_nav4
    )
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }
    BottomAppBar {
        NavigationBar {
            items.forEachIndexed { index, item ->
                val selected = currentRoute(navController) == item.route
                NavigationBarItem(
                    selected = selectedItemIndex == index,
                    onClick = {
                        selectedItemIndex = index
                        navController.navigate(item.route)
                    },
                    icon = {
                        Icon(
                            imageVector = if (index == selectedItemIndex) {
                                item.selectedIcon
                            } else item.unselectedIcon,
                            contentDescription = item.title
                        )
                    },
                    label = {
                        Text(text = item.title)
                    }
                )
            }
        }
    }
}