package com.example.mapsapp.ui.Drawer


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mapsapp.ui.navigation.Destination

enum class DrawerItem(
    val icon: ImageVector,
    val text: String,
    val route: Destination
) {
    Permission(Icons.Default.Home, "Permission", Destination.Permission),
    Drawer(Icons.Default.Settings, "Drawer", Destination.Drawer),
    Map(Icons.Default.Settings, "Map", Destination.Map),
    List(Icons.Default.Info, "List", Destination.List),
}
