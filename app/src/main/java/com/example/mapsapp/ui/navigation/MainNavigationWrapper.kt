package com.example.mapsapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mapsapp.ui.Drawer.DrawerNavigation
import com.example.mapsapp.ui.navigation.Destination.Map
import com.example.mapsapp.ui.navigation.Destination.List


@Composable
fun MainNavigationWrapper(navController: NavHostController, modifier: Modifier) {
    NavHost(navController, Map) {
        composable<Map> {
            DrawerNavigation()
        }
        composable<List> {
            DrawerNavigation()
        }
    }
}