package patternStartegy

class PenaliteVerification : StrategyVerification{
    private var nbErreurs = 0
    private var nbErreursMax = 7
    override fun verifierLettre(lettre: String?, motSecret: String): Boolean {
        // Vérifie si la lettre proposée par le joueur est correcte, sinon incrémente le compteur d'erreurs
        val estCorrecte = lettre?.let { motSecret.contains(it) }
        if (!estCorrecte!!) {
            nbErreurs++
        }
        return estCorrecte
    }

    override fun verifierMot(motPropose: String, motSecret: String): Boolean {
        // Vérifie si le mot proposé par le joueur est correct, sinon incrémente le compteur d'erreurs
        val estCorrect = motPropose.equals(motSecret, ignoreCase = true)
        if (!estCorrect) {
            nbErreurs++
        }
        return estCorrect || nbErreurs >= nbErreursMax
    }
}