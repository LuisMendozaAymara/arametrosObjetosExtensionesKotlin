data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)

fun main(){
    val Event1 = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", "Evening", 15)

    println(Event1.toString())
}