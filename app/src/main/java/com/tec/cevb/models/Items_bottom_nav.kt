package com.tec.cevb.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmarks
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Bookmarks
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Map
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.tec.cevb.navigation.TopLevelDestination

sealed class Items_bottom_nav(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
) {
    object Item_bottom_nav1: Items_bottom_nav(
        title = "Inicio",
        route = TopLevelDestination.HOME.name,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home
    )
    object Item_bottom_nav2: Items_bottom_nav(
        title = "Favoritos",
        route = TopLevelDestination.BOOKMARKS.name,
        selectedIcon = Icons.Filled.Bookmarks,
        unselectedIcon = Icons.Outlined.Bookmarks
    )
    object Item_bottom_nav3: Items_bottom_nav(
        title = "Mapeo",
        route = TopLevelDestination.MAPPING.name,
        selectedIcon = Icons.Filled.Map,
        unselectedIcon = Icons.Outlined.Map
    )
    object Item_bottom_nav4: Items_bottom_nav(
        title = "Ajustes",
        route = TopLevelDestination.SETTINGS.name,
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings
    )
}
