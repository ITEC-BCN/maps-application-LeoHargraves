package com.example.mapsapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mapsapp.ui.Drawer.DrawerNavigation
import com.example.mapsapp.ui.navigation.Destination.PermissionR
import com.example.mapsapp.ui.navigation.Destination.Drawer
import com.example.mapsapp.ui.navigation.Destination.Map
import com.example.mapsapp.ui.navigation.Destination.List
import com.example.mapsapp.ui.screens.PermissionsScreen


@Composable
fun MainNavigationWrapper(navController: NavHostController, modifier: Modifier) {
    NavHost(navController, PermissionR) {
        composable<PermissionR> {
            PermissionsScreen()
        }
        composable<Drawer> {
            DrawerNavigation()
        }
        composable<Map> {
            DrawerNavigation()
        }
        composable<List> {
            DrawerNavigation()
        }
    }
}