import javax.print.attribute.standard.MediaSize.Other

fun main()
{
    operator fun Int.times(str: String)=str.repeat(this)
    println(2 * "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String)=Pair(this, other)
    val myPair= "Lar" to "Luke"
    println(myPair)

    val sophia = Person("Sophia")
    val rachel = Person ("Rachel")
    sophia likes rachel
     printAll("Hi", "I", "think I need", "Help")

}
class Person(val name: String)
{
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person){ likedPeople.add(other)}
}
fun printAll(vararg messages: String){
    for (m in messages)
    {
        println(m)
    }
}