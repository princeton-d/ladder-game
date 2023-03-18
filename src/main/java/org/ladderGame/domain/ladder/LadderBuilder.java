package org.ladderGame.domain.ladder;

import org.ladderGame.domain.player.Player;
import org.ladderGame.domain.reward.Reward;
import org.ladderGame.view.OutputView;

import java.util.List;
import java.util.Random;

public class LadderBuilder {
    public static Ladder makeLadder(LadderInfo ladderInfo) {
        String listedPlayerNames = LadderBuilder.createListedPlayerNames(ladderInfo);
        String listedRewardNames = LadderBuilder.createListedRewardNames(ladderInfo);
        String[][] LadderBody = LadderBuilder.createLadderBody(ladderInfo);
    
        return new Ladder(listedPlayerNames, listedRewardNames, LadderBody);
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
    
    public static String[][] createLadderBody(LadderInfo ladderInfo) {
        final int LADDER_HEIGHT = ladderInfo.getHeightOfLadder();
        final int NUMBER_OF_PLAYER = ladderInfo.getNumberOfPlayer();
        final String LADDER_COLUMN_SHAPE = "|";
        final String LADDER_ROW_SHAPE = "-----";
        final String EMPTY_LADDER_ROW = "     ";
        final String[][] ladderBody = new String[LADDER_HEIGHT][NUMBER_OF_PLAYER];
        boolean prevRowPrint = false;
        
        for (int i = 0; i < LADDER_HEIGHT; i++) {
            for (int j = 0; j < NUMBER_OF_PLAYER; j++) {
                final int LAST_INDEX = NUMBER_OF_PLAYER - 1;
                
                if (j == LAST_INDEX) {
                    ladderBody[i][j] = LADDER_COLUMN_SHAPE;
                    continue;
                }
                
                if (!prevRowPrint && randomBoolean()) {
                    ladderBody[i][j] = LADDER_COLUMN_SHAPE + LADDER_ROW_SHAPE;
                    prevRowPrint = true;
                    continue;
                }
                ladderBody[i][j] = LADDER_COLUMN_SHAPE + EMPTY_LADDER_ROW;
            }
            prevRowPrint = false;
        }
        return ladderBody;
    }
    
    public static String createListedRewardNames(LadderInfo ladderInfo) {
        String listedRewardNames = "";
        int numberOfReward = ladderInfo.getNumberOfReward();
        List<Reward> rewardList = ladderInfo.getRewardsList();
        
        for (int i = 0; i < numberOfReward; i++) {
            String rewardName = rewardList.get(i).getReward();
            listedRewardNames += rewardName + "    ";
        }
        
        return listedRewardNames;
    }
    
    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}