package patternMVC

class JeuPenduController(private val model: JeuPenduModel, private val view: JeuPenduView) {
    // Réagit aux interactions de l'utilisateur et coordonne les actions du modèle et de la vue
    var victoire = false
    var jouer = true
    var essais = 8
    fun jouer() {
        // Boucle principale du jeu
        val motSecret = model.obtenirMotSecret()
        var motMasque = motSecret.replace(Regex("[A-Za-z]"), "*")

        while (jouer || essais >0) {
            view.afficherMotMasque(motMasque)
            var usrInput = view.saisirLettre()?.uppercase()
            if (usrInput != null) {
                view.afficherPendu(essais)
                if (usrInput.length == 1){
                    if (model.estLettreCorrecte(usrInput)) {
                        view.afficherMessage("Lettre correcte !")
                        // Mettre à jour le mot masqué avec la lettre correcte
                        motMasque = motSecret.map { if (it == usrInput!!.first()) it else '*' }.joinToString("")
                    } else {
                        view.afficherMessage("Lettre incorrecte.")
                        essais--
                    }
                } else {
                    if (model.estMotCorrect(usrInput)) {
                        view.afficherMessage("Mot correct !")
                    } else {
                        view.afficherMessage("Mot incorrect.")
                        essais -= 4
                    }
                }
            } else {
                print("Mauvaise saisie.\n")
                usrInput = view.saisirLettre()?.uppercase()
            }

            if (essais == 0){
                view.afficherPendu(essais)
                print("Défaite.")
                break
            }
            // Vérifier si le mot masqué correspond au mot secret
            if (motMasque == motSecret || usrInput == motSecret) {
                view.afficherMessage("Bravo, vous avez deviné le mot secret : $motSecret")
                break
            }
        }
    }
}
