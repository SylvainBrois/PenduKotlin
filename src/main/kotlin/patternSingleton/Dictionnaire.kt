object Dictionnaire {
    private val motsPossibles = listOf("PENDU", "ORDINATEUR", "PROGRAMMATION", "KOTLIN")

    fun obtenirMotAleatoire(): String {
        // Renvoie un mot aléatoire du dictionnaire
        return motsPossibles.random()
    }
}