import java.util.*


fun handFunction(h1: Int): Int {
    //val hand= 1 use 'hand' instead of 'h1' below only
    var checkHand = if (h1 > 2 || h1 < 0) 0 else 1
    return checkHand

}
fun showHand(h1: Int, pname: String) {
    val listhand = listOf("Stone", "Paper", "Scissor")
    println(pname + " picked: " + listhand.elementAt(h1))
    }

fun match(player: Int, machine: Int){
    if (player===machine){
        println ("Draw")
    }
    else if (player===0 && machine===1 ) {"Player Lost"

}
   else if (player===1&& machine===2)
    {"Player Lost"}

    else if(player===2 && machine===0){
        "player lost"
    }
    else{"Player Won"}

fun main(args: Array<String>) {
    println("Starting the Rock Paper Scissors game !")
    print("Please enter your name: ")
    val nameUser = readLine()
    println("Your name is: $nameUser")

    println("Pick a hand: (0: Rock, 1: Paper 2: Scissor")
    print("Please enter a number (0-2): ")
    val playerHand = Integer.valueOf(readLine())
    println("Your number is: $playerHand")
    var result: Int
    result = handFunction(playerHand)
    println(result)

    if (result > 0) {
        var compHand = (0..2).random()

        showHand(playerHand, pname = "$nameUser")
        showHand(compHand, pname = "Machine")


        match(playerHand, compHand)


    }
}













