package org.ladderGame;

import org.ladderGame.domain.ladder.Ladder;
import org.ladderGame.domain.player.Players;
import org.ladderGame.domain.reward.Rewards;
import org.ladderGame.view.InputView;
import org.ladderGame.view.OutputView;

public class Game {
    
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    
    public void startGame() {
        String[] playerNames = inputView.enterPlayerName(outputView);
        String[] rewardsNames = inputView.enterReward(outputView);
        int heightOfLadder = inputView.enterLadderHeight(outputView);
        
        Players players = Players.create(playerNames);
        Rewards rewards = Rewards.createRewardList(rewardsNames);
        Ladder ladder = new Ladder(); // 수정필요
    }
}