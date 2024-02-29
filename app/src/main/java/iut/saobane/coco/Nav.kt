package iut.saobane.coco

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            loginDisplay(navController)
        }
        composable(
            route = "accueil/{log1}/{mdp1}",
            arguments = listOf(
                navArgument("log1") { // Correction ici
                    type = NavType.StringType
                },
                navArgument("mdp1") { // Correction ici
                    type = NavType.StringType
                },
            )
        ) { backstackEntry ->
            AccueilDisplay(
                navController,
                login = backstackEntry.arguments?.getString("log1"),
                mdp = backstackEntry.arguments?.getString("mdp1")
            )
        }
    }
}
}