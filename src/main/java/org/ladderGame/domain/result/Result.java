package org.ladderGame.domain.result;

import org.ladderGame.domain.ladder.Ladder;
import org.ladderGame.domain.player.Player;
import org.ladderGame.domain.reward.Reward;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private final Map<Player, Reward> mappings = new HashMap<>();

    public Result(Ladder ladder, List<Player> players, List<Reward> rewards) {
        for (int topIndex = 0; topIndex < players.size(); topIndex++) {
            int bottomIndex = ladder.walk(topIndex);
            mappings.put(players.get(topIndex), rewards.get(bottomIndex));
        }
    }
}