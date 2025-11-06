package ucne.edu.angel_morel_ap2_p2.presentation.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.NavType
import ucne.edu.angel_morel_ap2_p2.presentation.gastos.GastosListScreen
import ucne.edu.angel_morel_ap2_p2.presentation.gastos.GastosScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Screen.GastosListScreen.route,
        modifier = modifier
    ) {
        composable(Screen.GastosListScreen.route) {
            GastosListScreen(navController = navController)
        }

        composable(
            route = "${Screen.GastosScreen.route}?gastoId={gastoId}",
            arguments = listOf(
                navArgument("gastoId") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) { backStackEntry ->
            val gastoId = backStackEntry.arguments?.getInt("gastoId") ?: 0
            GastosScreen(
                navController = navController,
                gastoId = if (gastoId == 0) null else gastoId
            )
        }
    }
}
