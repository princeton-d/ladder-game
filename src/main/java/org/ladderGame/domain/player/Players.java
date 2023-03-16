package org.ladderGame.domain.player;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

    private final List<Player> players;

    private Players(List<Player> players) {
        this.players = players;
    }

    public static Players create(String[] playerArray) {
        List<Player> players = Arrays.stream(playerArray)
                .map(Player::new)
                .collect(Collectors.toUnmodifiableList());

        return new Players(players);
    }
}