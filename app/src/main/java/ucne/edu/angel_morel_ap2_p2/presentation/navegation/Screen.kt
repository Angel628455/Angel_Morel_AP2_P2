package ucne.edu.angel_morel_ap2_p2.presentation.navegation

sealed class Screen(val route: String) {
    object GastosListScreen : Screen("gastos_list_screen")
    object GastosScreen : Screen("gastos_screen") {
        fun createRoute(gastoId: Int? = null): String {
            return if (gastoId != null) {
                "gastos_screen?gastoId=$gastoId"
            } else {
                "gastos_screen"
            }
        }
    }
}
