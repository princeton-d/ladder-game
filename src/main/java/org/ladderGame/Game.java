package org.ladderGame;

import org.ladderGame.domain.ladder.Ladder;
import org.ladderGame.domain.ladder.LadderBuilder;
import org.ladderGame.domain.ladder.LadderInfo;
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
        Rewards rewards = Rewards.createRewardList(rewardsNames);
        
        LadderInfo ladderInfo = new LadderInfo(heightOfLadder, players, rewards);
        
        Ladder ladder = LadderBuilder.makeLadder(ladderInfo);
        
        outputView.printLadder(ladder);
        
        int location;
        
        for (int i = 0; i < playerNames.length; i++) {
            location = i;
            int result = findResult(heightOfLadder, ladder, location);
            players.getPlayersList().get(i).enterResult(rewards.getRewards().get(result));
        }

        inputView.enterPlayerNameForResult(outputView, players);
    }
    
    private static int findResult(int heightOfLadder, Ladder ladder, int location) {
        for (int i = 0; i < heightOfLadder; i++) {
            if (ladder.getLadderBody()[i][location].equals("|-----")) {
                ++location;
                continue;
            }
            
            if (location != 0 && ladder.getLadderBody()[i][location - 1].equals("|-----")) {
                --location;
            }
        }
        return location;
    }
}