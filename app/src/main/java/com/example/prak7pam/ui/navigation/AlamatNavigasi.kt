package com.example.prak7pam.ui.navigation

interface AlamatNavigasi {
    val route: String
}

object DestinasiInsert : AlamatNavigasi {
    override val route: String = "insert"
}

object DestinasiHome : AlamatNavigasi {
    override val route = "home"
}