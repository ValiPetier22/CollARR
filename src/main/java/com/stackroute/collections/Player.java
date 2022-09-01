package com.stackroute.collections;

public class Player {
    private int playerId;
    private String playerName;
    private int playerScore;
    private String playerMatch;

    public Player(int playerId, String playerName, int playerScore, String playerMatch) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.playerMatch = playerMatch;
    }

    public Player() {
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getPlayerMatch() {
        return playerMatch;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName=" + playerName +
                ", playerScore=" + playerScore +
                ", playerMatch=" + playerMatch + '\'' +
                '}';
    }
}