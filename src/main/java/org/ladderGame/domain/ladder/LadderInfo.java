package org.ladderGame.domain.ladder;

import org.ladderGame.domain.player.Player;
import org.ladderGame.domain.player.Players;
import org.ladderGame.domain.reward.Reward;
import org.ladderGame.domain.reward.Rewards;

import java.util.List;

public class LadderInfo {
    private final int HEIGHT_OF_LADDER;
    private final List<Player> players;
    private final List<Reward> rewards;
    private final int NUMBER_OF_PLAYER;
    private final int NUMBER_OF_REWARD;
    
    public LadderInfo(int heightOfLadder, Players players, Rewards rewards) {
        this.HEIGHT_OF_LADDER = heightOfLadder;
        this.players = players.getPlayersList();
        this.rewards = rewards.getRewards();
        this.NUMBER_OF_PLAYER = players.getPlayersList().size();
        this.NUMBER_OF_REWARD = rewards.getRewards().size();
    }
    
    public int getHeightOfLadder() {
        return HEIGHT_OF_LADDER;
    }
    
    public List<Player> getPlayersList() {
        return players;
    }
    
    public List<Reward> getRewardsList() {
        return rewards;
    }
    
    public int getNumberOfPlayer() {
        return NUMBER_OF_PLAYER;
    }
    
    public int getNumberOfReward() {
        return NUMBER_OF_REWARD;
    }
}