package com.stackroute.collections;

import java.util.Comparator;

public class PlayerScoreComparator implements Comparator<Player> {


    @Override
    public int compare(Player p1, Player p2) {
        int scoreCmp = p2.getPlayerScore() - p1.getPlayerScore();
        if (scoreCmp == 0) {
            return p1.getPlayerId() - p2.getPlayerId();
        }
        return scoreCmp;
    }
}