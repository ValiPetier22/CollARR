package com.stackroute.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerListService {

    private List<Player> playerList = new ArrayList<>();
    public void addPlayersToList(Player playerOne) {
        playerList.add(playerOne);
    }

    public List<Player> getPlayerListSortedByScoreInDescendingOrder() {
        Collections.sort(playerList, new PlayerScoreComparator());
        return playerList;
    }

    public List<Player> getPlayerListSortedByNameIgnoringCaseInAscendingOrder() {
        Comparator<Player> cmp = (p1,p2) -> p1.getPlayerName().compareToIgnoreCase(p2.getPlayerName());
        Collections.sort(playerList, cmp);
        return playerList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public List<Player> getPlayerListGreaterThanFiftySortedByScoreInDescendingOrder() {
        List<Player> listaNoua = new ArrayList<Player>();
        for(int i = 0; i < playerList.size();i++) {
            if(playerList.get(i).getPlayerScore() > 50){
                listaNoua.add(playerList.get(i));
            }
        }
        Collections.sort(listaNoua, new PlayerScoreComparator());
        return listaNoua;
    }

    public List<Player> getPlayerListPlayedInSameMatchSortedByNameInAscendingOrder(String match) {
        List<Player> newList = (List<Player>) playerList.stream()
                .filter(player -> player.getPlayerMatch().equals(match))
                .sorted(new PlayerNameComparator()).collect(Collectors.toList());
        return newList;
    }
}