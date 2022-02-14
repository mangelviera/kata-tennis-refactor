package tennis_kata

import tennis_kata.Player.PLAYER_1
import tennis_kata.Player.PLAYER_2

class TennisGame {
    private var points = Scoreboard.ZERO_ZERO

    fun wonPoint(player: Player) {
        points = when (player) {
            PLAYER_1 -> points.player1NextScore()
            PLAYER_2 -> points.player2NextScore()
        }
    }

    fun getScore() = points.score
}