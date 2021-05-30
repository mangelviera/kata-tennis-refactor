package tennis_kata;

public enum Point implements PointScore {
    ZERO_ZERO {
        @Override
        public Point player1Score() {
            return FIFTEEN_ZERO;
        }

        @Override
        public Point player2Score() {
            return ZERO_FIFTEEN;
        }

        @Override
        public String result() {
            return "Love-All";
        }
    },
    ZERO_FIFTEEN {
        @Override
        public Point player1Score() {
            return FIFTEEN_FIFTEEN;
        }

        @Override
        public Point player2Score() {
            return ZERO_THIRTY;
        }

        @Override
        public String result() {
            return "Love-Fifteen";
        }
    },
    ZERO_THIRTY {
        @Override
        public Point player1Score() {
            return FIFTEEN_THIRTY;
        }

        @Override
        public Point player2Score() {
            return ZERO_FORTY;
        }

        @Override
        public String result() {
            return "Love-Thirty";
        }
    },
    ZERO_FORTY {
        @Override
        public Point player1Score() {
            return FIFTEEN_FORTY;
        }

        @Override
        public Point player2Score() {
            return PLAYER_TWO_WIN;
        }

        @Override
        public String result() {
            return "Love-Forty";
        }
    },
    FIFTEEN_ZERO {
        @Override
        public Point player1Score() {
            return THIRTY_ZERO;
        }

        @Override
        public Point player2Score() {
            return FIFTEEN_FIFTEEN;
        }

        @Override
        public String result() {
            return "Fifteen-Love";
        }
    },
    THIRTY_ZERO {
        @Override
        public Point player1Score() {
            return FORTY_ZERO;
        }

        @Override
        public Point player2Score() {
            return THIRTY_FIFTEEN;
        }

        @Override
        public String result() {
            return "Thirty-Love";
        }
    },
    FORTY_ZERO {
        @Override
        public Point player1Score() {
            return PLAYER_ONE_WIN;
        }

        @Override
        public Point player2Score() {
            return FORTY_FIFTEEN;
        }

        @Override
        public String result() {
            return "Forty-Love";
        }
    },
    FIFTEEN_FIFTEEN {
        @Override
        public Point player1Score() {
            return THIRTY_FIFTEEN;
        }

        @Override
        public Point player2Score() {
            return FIFTEEN_THIRTY;
        }

        @Override
        public String result() {
            return "Fifteen-All";
        }
    },
    FIFTEEN_THIRTY {
        @Override
        public Point player1Score() {
            return THIRTY_THIRTY;
        }

        @Override
        public Point player2Score() {
            return FIFTEEN_FORTY;
        }

        @Override
        public String result() {
            return "Fifteen-Thirty";
        }
    },
    FIFTEEN_FORTY {
        @Override
        public Point player1Score() {
            return THIRTY_FORTY;
        }

        @Override
        public Point player2Score() {
            return PLAYER_TWO_WIN;
        }

        @Override
        public String result() {
            return "Fifteen-Forty";
        }
    },
    THIRTY_FIFTEEN {
        @Override
        public Point player1Score() {
            return FORTY_FIFTEEN;
        }

        @Override
        public Point player2Score() {
            return THIRTY_THIRTY;
        }

        @Override
        public String result() {
            return "Thirty-Fifteen";
        }
    },
    THIRTY_THIRTY {
        @Override
        public Point player1Score() {
            return FORTY_THIRTY;
        }

        @Override
        public Point player2Score() {
            return THIRTY_FORTY;
        }

        @Override
        public String result() {
            return "Thirty-All";
        }
    },
    THIRTY_FORTY {
        @Override
        public Point player1Score() {
            return FORTY_FORTY;
        }

        @Override
        public Point player2Score() {
            return PLAYER_TWO_WIN;
        }

        @Override
        public String result() {
            return "Thirty-Forty";
        }
    },
    FORTY_FIFTEEN {
        @Override
        public Point player1Score() {
            return PLAYER_ONE_WIN;
        }

        @Override
        public Point player2Score() {
            return FORTY_THIRTY;
        }

        @Override
        public String result() {
            return "Forty-Fifteen";
        }
    },
    FORTY_THIRTY {
        @Override
        public Point player1Score() {
            return PLAYER_ONE_WIN;
        }

        @Override
        public Point player2Score() {
            return FORTY_FORTY;
        }

        @Override
        public String result() {
            return "Forty-Thirty";
        }
    },
    FORTY_FORTY {
        @Override
        public Point player1Score() {
            return ADVANTAGE_FORTY;
        }

        @Override
        public Point player2Score() {
            return FORTY_ADVANTAGE;
        }

        @Override
        public String result() {
            return "Deuce";
        }
    },
    ADVANTAGE_FORTY {
        @Override
        public Point player1Score() {
            return PLAYER_ONE_WIN;
        }

        @Override
        public Point player2Score() {
            return FORTY_FORTY;
        }

        @Override
        public String result() {
            return "Advantage player1";
        }
    },
    FORTY_ADVANTAGE {
        @Override
        public Point player1Score() {
            return FORTY_FORTY;
        }

        @Override
        public Point player2Score() {
            return PLAYER_TWO_WIN;
        }

        @Override
        public String result() {
            return "Advantage player2";
        }
    },
    PLAYER_ONE_WIN {
        @Override
        public Point player1Score() {
            return PLAYER_ONE_WIN;
        }

        @Override
        public Point player2Score() {
            return PLAYER_ONE_WIN;
        }

        @Override
        public String result() {
            return "Win for player1";
        }
    },
    PLAYER_TWO_WIN {
        @Override
        public Point player1Score() {
            return PLAYER_TWO_WIN;
        }

        @Override
        public Point player2Score() {
            return PLAYER_TWO_WIN;
        }

        @Override
        public String result() {
            return "Win for player2";
        }
    }
}
