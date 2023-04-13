package patternStartegy

interface StrategyVerification {
    fun verifierLettre(lettre: String?, motSecret: String): Boolean
    fun verifierMot(motPropose: String, motSecret: String): Boolean
}