package tennis_kata

enum class Scoreboard(
    val player1NextScore: () -> Scoreboard,
    val player2NextScore: () -> Scoreboard,
    val score: String
) {
    ZERO_ZERO({ FIFTEEN_ZERO }, { ZERO_FIFTEEN }, "Love-All"),
    ZERO_FIFTEEN({ FIFTEEN_FIFTEEN }, { ZERO_THIRTY }, "Love-Fifteen"),
    ZERO_THIRTY({ FIFTEEN_THIRTY }, { ZERO_FORTY }, "Love-Thirty"),
    ZERO_FORTY({ FIFTEEN_FORTY }, { PLAYER_TWO_WIN }, "Love-Forty"),
    FIFTEEN_ZERO({ THIRTY_ZERO }, { FIFTEEN_FIFTEEN }, "Fifteen-Love"),
    THIRTY_ZERO({ FORTY_ZERO }, { THIRTY_FIFTEEN }, "Thirty-Love"),
    FORTY_ZERO({ PLAYER_ONE_WIN }, { FORTY_FIFTEEN }, "Forty-Love"),
    FIFTEEN_FIFTEEN({ THIRTY_FIFTEEN }, { FIFTEEN_THIRTY }, "Fifteen-All"),
    FIFTEEN_THIRTY({ THIRTY_THIRTY }, { FIFTEEN_FORTY }, "Fifteen-Thirty"),
    FIFTEEN_FORTY({ THIRTY_FORTY }, { PLAYER_TWO_WIN }, "Fifteen-Forty"),
    THIRTY_FIFTEEN({ FORTY_FIFTEEN }, { THIRTY_THIRTY }, "Thirty-Fifteen"),
    THIRTY_THIRTY({ FORTY_THIRTY }, { THIRTY_FORTY }, "Thirty-All"),
    THIRTY_FORTY({ FORTY_FORTY }, { PLAYER_TWO_WIN },"Thirty-Forty"),
    FORTY_FIFTEEN({ PLAYER_ONE_WIN }, { FORTY_THIRTY }, "Forty-Fifteen"),
    FORTY_THIRTY({ PLAYER_ONE_WIN }, { FORTY_FORTY }, "Forty-Thirty"),
    FORTY_FORTY({ ADVANTAGE_FORTY }, { FORTY_ADVANTAGE }, "Deuce"),
    ADVANTAGE_FORTY({ PLAYER_ONE_WIN }, { FORTY_FORTY },"Advantage player1"),
    FORTY_ADVANTAGE({ FORTY_FORTY }, { PLAYER_TWO_WIN }, "Advantage player2"),
    PLAYER_ONE_WIN({ PLAYER_ONE_WIN }, { PLAYER_ONE_WIN }, "Win for player1"),
    PLAYER_TWO_WIN({ PLAYER_TWO_WIN }, { PLAYER_TWO_WIN}, "Win for player2");

}