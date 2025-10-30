package ucne.edu.angel_morel_ap2_p2

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

class Aplication {
    @HiltAndroidApp
    class MyApplication : Application()
}