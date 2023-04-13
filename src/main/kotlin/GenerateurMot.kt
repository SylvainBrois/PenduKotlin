import kotlin.random.Random

class GenerateurMot(private val mots : List<String>) {
    fun genererMot() : String{
        return mots[Random.nextInt(mots.size)]
    }
}