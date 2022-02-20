package tennis_kata

import tennis_kata.Player.PLAYER_1
import tennis_kata.Player.PLAYER_2

class TennisGameTwo {
    private var score : ScoreboardTwo = Initial.new()

    fun wonPoint(player: Player) {
        score = when (player) {
            PLAYER_1 -> score.player1NextScore()
            PLAYER_2 -> score.player2NextScore()
        }
    }

    fun getScore() = score.score()
}