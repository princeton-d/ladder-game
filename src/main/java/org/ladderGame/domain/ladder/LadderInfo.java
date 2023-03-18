package org.ladderGame.domain.ladder;

import org.ladderGame.domain.player.Player;
import org.ladderGame.domain.reward.Reward;

import java.util.List;

public class LadderInfo {
    private final int HEIGHT_OF_LADDER;
    private final List<Player> players;
    private final List<Reward> rewards;
    private final int NUMBER_OF_PLAYER;
    
    public LadderInfo(int heightOfLadder, List<Player> players, List<Reward> rewards) {
        this.HEIGHT_OF_LADDER = heightOfLadder;
        this.players = players;
        this.rewards = rewards;
        this.NUMBER_OF_PLAYER = players.size();
    }
}