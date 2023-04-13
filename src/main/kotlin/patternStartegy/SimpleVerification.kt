package patternStartegy

class SimpleVerification : StrategyVerification{
    override fun verifierLettre(lettre: String?, motSecret: String): Boolean {
        // Vérifie si la lettre proposée par le joueur est correcte
        return lettre.toString() in motSecret
    }

    override fun verifierMot(motPropose: String, motSecret: String): Boolean {
        // Vérifie si le mot proposé par le joueur est correct
        return motPropose.equals(motSecret, ignoreCase = true)
    }
}