package com.shakbari.home.common.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.composable
import com.shakbari.home.presentation.ui.HomeScreen
import com.shakbari.navigation.Screen
import com.shakbari.navigation.base.NavComposableModule

val homeScreenNavModule = NavComposableModule { navHost, navController ->
    navHost.apply {
        composable(
            Screen.Home.name
        ) {
            HomeScreen(
                navController = navController,
            )
        }

    }

}