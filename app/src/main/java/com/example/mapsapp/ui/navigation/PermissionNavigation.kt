package com.example.mapsapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mapsapp.ui.navigation.Destination.PermissionR
import com.example.mapsapp.ui.navigation.Destination.Wrapper
import com.example.mapsapp.ui.screens.PermissionScreen

@Composable
fun PermissionNavigation(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = PermissionR) {
        composable<PermissionR> {
            PermissionScreen {
                navController.navigate(Wrapper) {
                    popUpTo(PermissionR) { inclusive = true }
                }
            }
        }
        composable<Wrapper> {
            MainNavigationWrapper(navController, modifier)
        }
    }
}