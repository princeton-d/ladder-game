package org.ladderGame.domain.reward;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rewards {
    
    private final List<Reward> rewards;
    
    private Rewards(List<Reward> rewards) {
        this.rewards = rewards;
    }
    
    public static Rewards createRewardList(String[] rewardArray) {
        List<Reward> rewards = Arrays.stream(rewardArray)
            .map(reward -> new Reward(reward))
            .collect(Collectors.toUnmodifiableList());
        return new Rewards(rewards);
    }
    
    public List<Reward> getRewards() {
        return rewards;
    }
}