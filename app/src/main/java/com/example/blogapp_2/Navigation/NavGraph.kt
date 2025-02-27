package com.example.blogapp_2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.blogapp_2.ui.BlogDetailScreen
import com.example.blogapp_2.ui.BlogListScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "blogList") {
        composable("blogList") { BlogListScreen(navController) }
        composable("blogDetail/{url}") { backStackEntry ->
            val url = backStackEntry.arguments?.getString("url") ?: ""
            BlogDetailScreen(url)
        }
    }
}
