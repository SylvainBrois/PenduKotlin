import patternMVC.JeuPenduController
import patternMVC.JeuPenduModel
import patternMVC.JeuPenduView

fun main() {
    // Point d'entrée du jeu
    val motSecret = Dictionnaire.obtenirMotAleatoire() // Mot secret à deviner
    val jeuPenduModel = JeuPenduModel(motSecret)
    val jeuPenduView = JeuPenduView()
    val jeuPenduController = JeuPenduController(jeuPenduModel, jeuPenduView)

    jeuPenduController.jouer()
}