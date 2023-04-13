package patternMVC

class JeuPenduView {
    // Affichage des éléments graphiques de l'interface utilisateur

    fun afficherMotMasque(motMasque: String) {
        // Affiche le mot masqué actuel
        println("Mot masqué : $motMasque")
    }

    fun afficherMessage(message: String) {
        // Affiche un message à l'utilisateur
        println(message)
    }

    fun afficherMotSecret(motSecret: String){
        println("Le mot à trouver était : $motSecret")
    }

    fun saisirLettre(): String? {
        // Demande à l'utilisateur de saisir une lettre et la renvoie
        print("Veuillez saisir une lettre : ")
        val lettre = readlnOrNull()
        return lettre
    }

    fun afficherPendu(nbEssaisRestants: Int) {
        when (nbEssaisRestants) {
            8 -> println("""
                    +---+
                        |
                        |
                        |
                        |
                        |
                =========
                """

            )
            7 -> println("""
                    +---+
                    |   |
                        |
                        |
                        |
                        |
                =========
                """)
            6 -> println("""
                    +---+
                    |   |
                    O   |
                        |
                        |
                        |
                =========
                """)
            5 -> println("""
                    +---+
                    |   |
                    O   |
                    |   |
                        |
                        |
                =========
                """)
            4 -> println("""
                    +---+
                    |   |
                    O   |
                   /|   |
                        |
                        |
                =========
                """)
            3 -> println("""
                    +---+
                    |   |
                    O   |
                   /|\  |
                        |
                        |
                =========
                """)
            2 -> println("""
                    +---+
                    |   |
                    O   |
                   /|\  |
                   /    |
                        |
                =========
                """)
            1 -> println("""
                    +---+
                    |   |
                    O   |
                   /|\  |
                   / \  |
                        |
                =========
                """)
            else -> println("Pendu complet!")
        }
    }
}