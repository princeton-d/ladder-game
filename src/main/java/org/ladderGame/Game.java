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
        
        int token;
        
        for (int i = 0; i < playerNames.length; i++) {
            token = i;
            int result = findResult(heightOfLadder, ladder, token);
            players.getPlayersList().get(i).enterResult(rewards.getRewards().get(result));
//            System.out.println(players.getPlayersList().get(i).getPlayerName() + " = " + rewards.getRewards().get(result).getReward());
        }

        inputView.enterPlayerNameForResult(outputView, players);
    }
    
    private static int findResult(int heightOfLadder, Ladder ladder, int token) {
        for (int i = 0; i < heightOfLadder; i++) {
            if (ladder.getLadderBody()[i][token].equals("|-----")) {
                ++token;
                continue;
            }
            
            if (token != 0 && ladder.getLadderBody()[i][token - 1].equals("|-----")) {
                --token;
            }
        }
        return token;
    }
}