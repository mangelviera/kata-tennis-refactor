package tennis_kata;

import static tennis_kata.Player.PLAYER_1;
import static tennis_kata.Player.PLAYER_2;

public class TennisGame
{
    private Point points;

    public TennisGame() {
        this.points = Point.ZERO_ZERO;
    }

    public String getScore(){
        return this.points.result();
    }

    public void wonPoint(Player player) {
        if (player.equals(PLAYER_1)) this.points = this.points.player1Score();
        if (player.equals(PLAYER_2)) this.points = this.points.player2Score();
    }

}