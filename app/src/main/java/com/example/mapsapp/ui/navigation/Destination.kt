package com.example.mapsapp.ui.navigation

import kotlinx.serialization.Serializable


sealed class Destination {
    @Serializable
    object Permission : Destination()
    @Serializable
    object Drawer : Destination()
    @Serializable
    object Map : Destination()
    @Serializable
    object list : Destination()
}