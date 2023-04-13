package patternMVC

import patternStartegy.PenaliteVerification

class JeuPenduModel(private val motSecret: String) {
    // Logique métier du jeu
    private var penaliteVerification: PenaliteVerification = PenaliteVerification()
    fun estLettreCorrecte(lettre: String?): Boolean {
        // Vérifie si la lettre proposée par le joueur est correcte
        return penaliteVerification.verifierLettre(lettre, motSecret)
    }

    fun estMotCorrect(mot : String) : Boolean{
        return penaliteVerification.verifierMot(mot, motSecret)
    }

    fun obtenirMotSecret(): String {
        // Renvoie le mot secret à deviner
        return motSecret
    }
}