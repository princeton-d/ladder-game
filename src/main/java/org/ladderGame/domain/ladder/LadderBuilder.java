package org.ladderGame.domain.ladder;

import org.ladderGame.domain.player.Player;
import org.ladderGame.view.OutputView;

import java.util.List;

public class LadderBuilder {
    private final String ladderColumnShape = "|";
    private final String ladderRowShape = "-----";
    private final String emptyLadderRow = "     ";
    
    public static void makeLadder(LadderInfo ladderInfo, OutputView outputView) {
        String listedPlayerNames = LadderBuilder.createListedPlayerNames(ladderInfo);
        String listedRewardNames = LadderBuilder.createListedRewardNames(ladderInfo);
        
    }
    
    public static String createListedPlayerNames(LadderInfo ladderInfo) {
        String listedPlayerNames = "";
        int numberOfPlayer = ladderInfo.getNumberOfPlayer();
        List<Player> playerList = ladderInfo.getPlayersList();
    
        for (int i = 0; i < numberOfPlayer; i++) {
            String playerName = playerList.get(i).getPlayerName();
            listedPlayerNames += playerName + "    ";
        }
    
        return listedPlayerNames;
    }
    
    public static String createListedRewardNames(LadderInfo ladderInfo) {
        String listedRewardNames = "";
        int numberOfReward = ladderInfo.getNumberOfReward();
    }
}