class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty {
    EASY, MEDIUM, HARD
}

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
	val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
	val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    
    println(question1.questionText + " Respuesta: " + question1.answer)
    println(question2.questionText + " Respuesta: " + question2.answer)
    println(question3.questionText + " Respuesta: " + question3.answer)
}