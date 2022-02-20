package tennis_kata

import tennis_kata.Initial.GamePoints.*
import tennis_kata.Player.*

interface ScoreboardTwo {
    fun player1NextScore(): ScoreboardTwo
    fun player2NextScore(): ScoreboardTwo
    fun score(): String
}

class Initial private constructor(private val player1Points: GamePoints, private val player2Points: GamePoints) : ScoreboardTwo {
    companion object {
        fun new() : ScoreboardTwo = Initial(LOVE, LOVE)
    }
    override fun player1NextScore(): ScoreboardTwo = when (player1Points) {
        LOVE, FIFTEEN -> Initial(player1Points.next(), player2Points)
        THIRTY -> if (player2Points == FORTY) Deuce() else Initial(player1Points.next(), player2Points)
        FORTY -> Win(PLAYER_1)
    }
    override fun player2NextScore(): ScoreboardTwo = when (player2Points) {
        LOVE, FIFTEEN -> Initial(player1Points, player2Points.next())
        THIRTY -> if (player1Points == FORTY) Deuce() else Initial(player1Points, player2Points.next())
        FORTY -> Win(PLAYER_2)
    }
    override fun score(): String = when (Pair(player1Points, player2Points)) {
        Pair(LOVE, LOVE), Pair(FIFTEEN, FIFTEEN), Pair(THIRTY, THIRTY) -> "${player1Points.displayName}-All"
        else -> "${player1Points.displayName}-${player2Points.displayName}"
    }
    private enum class GamePoints(val displayName: String, val next: () -> GamePoints) {
        LOVE("Love", { FIFTEEN }),
        FIFTEEN("Fifteen", { THIRTY }),
        THIRTY("Thirty", { FORTY }),
        FORTY("Forty", { FORTY })
    }
}

class Deuce : ScoreboardTwo {
    override fun player1NextScore(): ScoreboardTwo = Advantage(PLAYER_1)
    override fun player2NextScore(): ScoreboardTwo = Advantage(PLAYER_2)
    override fun score(): String = "Deuce"
}

class Advantage(private val advantagedPlayer: Player) : ScoreboardTwo {
    override fun player1NextScore(): ScoreboardTwo = when (advantagedPlayer) {
        PLAYER_1 -> Win(advantagedPlayer)
        PLAYER_2 -> Deuce()
    }
    override fun player2NextScore(): ScoreboardTwo = when (advantagedPlayer) {
        PLAYER_1 -> Deuce()
        PLAYER_2 -> Win(advantagedPlayer)
    }
    override fun score(): String = when (advantagedPlayer) {
        PLAYER_1 -> "Advantage player1"
        PLAYER_2 -> "Advantage player2"
    }
}

class Win(private val winner: Player) : ScoreboardTwo {
    override fun player1NextScore(): ScoreboardTwo = Win(winner)
    override fun player2NextScore(): ScoreboardTwo = Win(winner)
    override fun score() : String = when (winner) {
        PLAYER_1 -> "Win for player1"
        PLAYER_2 -> "Win for player2"
    }
}