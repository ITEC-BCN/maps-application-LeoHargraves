package com.example.mapsapp.ui.navigation

import kotlinx.serialization.Serializable

sealed class Destination {
    @Serializable
    object Drawer : Destination()
    @Serializable
    object Map : Destination()
    @Serializable
    object List : Destination()
    @Serializable
    object PermissionR : Destination()

    @Serializable
    object Wrapper : Destination()
}
