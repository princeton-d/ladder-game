package org.ladderGame.domain.ladder;

public class Ladder {
    private final String playerList;
    private final String rewardList;
    private final String[][] ladderBody;
    
    public Ladder(String playerList, String rewardList, String[][] ladderBody) {
        this.playerList = playerList;
        this.ladderBody = ladderBody;
        this.rewardList = rewardList;
    }
}