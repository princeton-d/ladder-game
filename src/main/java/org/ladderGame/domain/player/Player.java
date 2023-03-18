package org.ladderGame.domain.player;

import org.ladderGame.domain.reward.Reward;

public class Player {
    
    private final String name;
    private Reward reward;
    
    public Player(String name) {
        this.name = name;
    }
    
    public String getPlayerName() {
        return name;
    }
}