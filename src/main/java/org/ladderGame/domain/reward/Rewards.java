package org.ladderGame.domain.reward;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rewards {

    private final List<Reward> rewards;

    private Rewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    public static Rewards create(String[] rewards) {
        List<Reward> rewardList = Arrays.stream(rewards)
                .map(reward -> new Reward(reward))
                .collect(Collectors.toUnmodifiableList());
        return new Rewards(rewardList);
    }

    public List<Reward> getRewards() {
        return rewards;
    }
}