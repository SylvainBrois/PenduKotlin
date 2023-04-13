import java.io.File

fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    val mots : List<String> = listOf("Bonjour", "AuRevoir", "Demain", "Cucurbitacé", "Anticonstitutionnellement", "Eclater")
    val generateurMot = GenerateurMot(mots)
    println(generateurMot.genererMot())
}