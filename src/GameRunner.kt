class GameRunner {

    val dfltDeck = listOf(0,0,1,1,2,2,2,3,3,3,3,4,4,4,5,5,6,6,7,8)

    var playerOne: Player
    var playerTwo: Player

    init {
        println("Enter player one name:")
        playerOne = Player(readPlayerName(), dfltDeck.map { Card(it) })

        println("Enter player two name:")
        playerTwo = Player(readPlayerName())
    }

    fun run() {

    }

    private fun readPlayerName(): String {
        var name: String?

        do {
            name = readLine()
        } while (name == null || name.trim() == "")

        return name
    }
}
