package org.ladderGame;

import org.ladderGame.domain.ladder.Ladder;
import org.ladderGame.domain.player.Players;
import org.ladderGame.domain.reward.Rewards;
import org.ladderGame.view.InputView;
import org.ladderGame.view.OutputView;

public class Game {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void startGame() {
        String[] playerNames = inputView.enterPlayersName(outputView);
        String[] rewardsNames = inputView.enterRewards(outputView);
        int heightOfLadder = inputView.enterLadderHeight(outputView);

        Players players = Players.create(playerNames);
        Rewards rewards = Rewards.create(rewardsNames);

        Ladder ladder = Ladder.create(players.size(), heightOfLadder);


    }
}